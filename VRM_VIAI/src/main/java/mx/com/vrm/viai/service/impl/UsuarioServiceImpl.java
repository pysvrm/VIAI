package mx.com.vrm.viai.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.vrm.viai.dao.UsuariosDAO;
import mx.com.vrm.viai.model.usr.Usuario;
import mx.com.vrm.viai.service.UsuariosService;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuariosService {
	
	@Autowired
	UsuariosDAO usuariosDAO;

	public List<Usuario> obtenerUsuarios() {
		return usuariosDAO.obtenerUsuarios();
	}

}
