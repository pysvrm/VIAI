package mx.com.vrm.viai.service;

import java.util.List;

import mx.com.vrm.viai.model.User;


public interface UsuariosService {

	public List<User> obtenerUsuarios();
	public boolean insertarUsuarios(User usuario);
}
