package mx.com.vrm.viai.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.vrm.viai.dao.UsuariosDAO;
import mx.com.vrm.viai.model.User;
import mx.com.vrm.viai.service.UsuariosService;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuariosService {

	@Autowired
	UsuariosDAO usuariosDAO;

	public List<User> obtenerUsuarios() {
		return usuariosDAO.obtenerUsuarios();
	}

	@Override
	public boolean insertarUsuarios(User usuario) {
		return usuariosDAO.insertarUsuarios(usuario);
	}

}
