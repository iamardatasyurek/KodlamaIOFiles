package kodlamaIOWebsite.bussiness;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOWebsite.core.logging.Logger;
import kodlamaIOWebsite.dataAccess.*;
import kodlamaIOWebsite.entities.Entity;

public abstract class BaseManager<T extends Entity> {
	protected GenericDal<T> genericDal;
	protected List<Logger> loggers;
	protected List<T> listOfEntities;
	
	public BaseManager() {
		listOfEntities = new ArrayList<T>();
	}

	public BaseManager(GenericDal<T> genericDal, List<Logger> loggers) {
		this.genericDal = genericDal;
		this.loggers = loggers;
		listOfEntities = new ArrayList<T>();
	}
	
	public abstract void add(T entity) throws Exception;
	public abstract void update(T entity);
	public abstract void delete(T entity);
	
	public GenericDal<T> getGenericDal() {
		return genericDal;
	}

	public void setGenericDal(GenericDal<T> genericDal) {
		this.genericDal = genericDal;
	}

	public List<Logger> getLoggers() {
		return loggers;
	}

	public void setLoggers(List<Logger> loggers) {
		this.loggers = loggers;
	}

	public List<T> getListOfEntities() {
		return listOfEntities;
	}

	
}
