package mx.com.vrm.viai.configuration.crudmngImpl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.com.vrm.viai.configuration.CrudDataManager;

public class CrudDataManagerImpl<T, PK extends Serializable> implements CrudDataManager<T, PK> {

	protected Class<T> entityClass;

	@PersistenceContext
	protected EntityManager manager;

	@SuppressWarnings("unchecked")
	public CrudDataManagerImpl() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
	}

	
	
	public T create(T t) {
		this.manager.persist(t);
		return t;
	}

	public T read(PK id) {
		return this.manager.find(entityClass, id);
	}

	public T update(T t) {
		return this.manager.merge(t);
	}

	public void delete(T t) {
		t = this.manager.merge(t);
		this.manager.remove(t);
	}

}
