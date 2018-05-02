package mx.com.vrm.viai.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.vrm.viai.dao.UsuariosDAO;
import mx.com.vrm.viai.model.User;
import mx.com.vrm.viai.service.UsuariosService;

// TODO: Auto-generated Javadoc
/**
 * The Class UsuarioServiceImpl.
 */
@Service
@Transactional
public class UsuarioServiceImpl implements UsuariosService {

	/** The usuarios DAO. */
	@Autowired
	UsuariosDAO usuariosDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see mx.com.vrm.viai.service.UsuariosService#obtenerUsuarios()
	 */
	public List<User> obtenerUsuarios() {
		return usuariosDAO.obtenerUsuarios();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * mx.com.vrm.viai.service.UsuariosService#insertarUsuarios(mx.com.vrm.viai.
	 * model.User)
	 */
	@Override
	public boolean insertarUsuarios(User usuario) {
		return usuariosDAO.insertarUsuarios(usuario);
	}

}
