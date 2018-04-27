package mx.com.vrm.viai.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mx.com.vrm.viai.configuration.restDTO.ResponseObj;
import mx.com.vrm.viai.model.User;
import mx.com.vrm.viai.service.UsuariosService;

@RestController
@RequestMapping("/rest")
public class AppControllerRest {
	
	private static final Logger logger = LoggerFactory.getLogger(AppControllerRest.class);
	@Autowired
	UsuariosService usuariosService;
		
	@GetMapping("/usuarios/")
	public List<User> listAllUsers() {
		List<User> users = new ArrayList<User>();
		users = usuariosService.obtenerUsuarios();
		return users;
	}
}
