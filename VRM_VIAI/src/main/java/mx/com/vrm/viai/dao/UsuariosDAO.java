package mx.com.vrm.viai.dao;

import java.util.List;

import mx.com.vrm.viai.model.User;;

public interface UsuariosDAO {

	public List<User> obtenerUsuarios();

	public boolean insertarUsuarios(User usuario);

}
