package kodlamaIOWebsite.bussiness;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOWebsite.core.logging.Logger;
import kodlamaIOWebsite.dataAccess.*;

public abstract class BaseManager<T> {
	protected GenericDal<T> genericDal;
	protected List<Logger> loggers;
	protected List<T> item;
	
	public BaseManager(GenericDal<T> genericDal, List<Logger> loggers) {
		this.genericDal = genericDal;
		this.loggers = loggers;
		item = new ArrayList<T>();
	}

	public abstract void add(T t) throws Exception;

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

	public List<T> getItem() {
		return item;
	}

	public void setItem(List<T> item) {
		this.item = item;
	}
}
