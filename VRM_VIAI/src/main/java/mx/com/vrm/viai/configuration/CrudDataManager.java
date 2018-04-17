package mx.com.vrm.viai.configuration;

import java.io.Serializable;

public interface CrudDataManager<T, PK extends Serializable> {
	T create(T t);

	T read(PK id);

	T update(T t);

	void delete(T t);
}
