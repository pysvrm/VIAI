package mx.com.vrm.viai.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import mx.com.vrm.viai.configuration.crudmngImpl.CrudDataManagerImpl;
import mx.com.vrm.viai.dao.UsuariosDAO;
import mx.com.vrm.viai.model.User;

// TODO: Auto-generated Javadoc
/**
 * The Class UsuariosDAOImpl.
 */
@Repository
public class UsuariosDAOImpl extends CrudDataManagerImpl<User, Serializable> implements UsuariosDAO {

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(UsuariosDAOImpl.class);

	/** The lista usuarios. */
	public List<User> listaUsuarios = new ArrayList<User>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see mx.com.vrm.viai.dao.UsuariosDAO#obtenerUsuarios()
	 */
	public List<User> obtenerUsuarios() {
		listaUsuarios = manager
				.createQuery("SELECT uu FROM User uu, UserRole rr WHERE uu.id.idusers = rr.iduserRoles", User.class)
				.getResultList();
		return listaUsuarios;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * mx.com.vrm.viai.dao.UsuariosDAO#insertarUsuarios(mx.com.vrm.viai.model.
	 * User)
	 */
	@Override
	public boolean insertarUsuarios(User usuario) {
		try {
			logger.info("::Insertar Usuario::");
			create(usuario);
		} catch (Exception e) {
			logger.error("::Error al insertar usuario::" + e);
			return false;
		}
		return false;
	}

}
