package mx.com.vrm.viai.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import mx.com.vrm.viai.configuration.crudmngImpl.CrudDataManagerImpl;
import mx.com.vrm.viai.dao.UsuariosDAO;
import mx.com.vrm.viai.model.usr.Usuario;

@Repository
public class UsuariosDAOImpl extends CrudDataManagerImpl<Usuario, Serializable> implements UsuariosDAO {

	private static final Logger logger = LoggerFactory.getLogger(UsuariosDAOImpl.class);
	public List<Usuario> listaUsuarios = new ArrayList<Usuario>();

	public List<Usuario> obtenerUsuarios() {
		listaUsuarios = manager.createQuery("select c from Usuario c", Usuario.class).getResultList();
		return listaUsuarios;
	}

}
