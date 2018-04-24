package mx.com.vrm.viai.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.vrm.viai.model.User;
import mx.com.vrm.viai.service.UsuariosService;

//@RestController
public class AppControllerRest {

//	@Autowired
//	UsuariosService usuariosService;
//
//	@PostMapping(value = "/usuarios/")
//	public List<User> listAllUsers() {
//		List<User> users = usuariosService.obtenerUsuarios();
//		if (users.isEmpty()) {
//			return users;
//		}
//		return users;
//	}
}
