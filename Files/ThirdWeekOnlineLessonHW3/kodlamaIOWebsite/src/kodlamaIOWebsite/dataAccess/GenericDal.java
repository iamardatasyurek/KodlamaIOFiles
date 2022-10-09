package kodlamaIOWebsite.dataAccess;

public interface GenericDal<T> {
	void add(T t);
	void update(T t);
	void delete(T t);
}
