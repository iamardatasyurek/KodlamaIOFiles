package kodlamaIOWebsite.dataAccess;

import kodlamaIOWebsite.entities.Category;

public class JdbcCategoryDal implements CategoryDal {

	@Override
	public void add(Category t) {
		System.out.println("Category is added with JDBC : " + t.getName());
	}

	@Override
	public void update(Category t) {
		System.out.println("Category is updated with JDBC : " + t.getName());
	}

	@Override
	public void delete(Category t) {
		System.out.println("Category is deleted with JDBC : " + t.getName());
	}
}
