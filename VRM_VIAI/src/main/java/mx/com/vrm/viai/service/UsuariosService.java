package mx.com.vrm.viai.service;

import java.util.List;

import mx.com.vrm.viai.model.User;

// TODO: Auto-generated Javadoc
/**
 * The Interface UsuariosService.
 */
public interface UsuariosService {

	/**
	 * Obtener usuarios.
	 *
	 * @return the list
	 */
	public List<User> obtenerUsuarios();

	/**
	 * Insertar usuarios.
	 *
	 * @param usuario
	 *            the usuario
	 * @return true, if successful
	 */
	public boolean insertarUsuarios(User usuario);
}
