package mx.com.vrm.viai.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.com.vrm.viai.configuration.restDTO.ResponseObj;
import mx.com.vrm.viai.model.User;
import mx.com.vrm.viai.service.UsuariosService;

@Controller
@RequestMapping("/rest")
public class AppControllerRest {
	
	private static final Logger logger = LoggerFactory.getLogger(AppControllerRest.class);
	@Autowired
	UsuariosService usuariosService;
	ResponseObj responseObj = new ResponseObj();
	
	
	@RequestMapping(value = "/usuarios", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<List<User>> listAllUsers() {
		List<User> users = usuariosService.obtenerUsuarios();
		if (users.isEmpty()) {
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/usuarios2", method = RequestMethod.POST, produces ="application/json")
	public @ResponseBody ResponseEntity<List<User>> listAllUsers2(){
		List<User> users = usuariosService.obtenerUsuarios();
		if (users.isEmpty()) {
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	

}
