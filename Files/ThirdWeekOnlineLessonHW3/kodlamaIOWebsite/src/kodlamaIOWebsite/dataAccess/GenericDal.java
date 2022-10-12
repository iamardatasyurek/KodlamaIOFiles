package kodlamaIOWebsite.dataAccess;

import kodlamaIOWebsite.entities.Entity;

public interface GenericDal<T extends Entity> {
	void add(T entity);
	void update(T entity);
	void delete(T entity);
}
