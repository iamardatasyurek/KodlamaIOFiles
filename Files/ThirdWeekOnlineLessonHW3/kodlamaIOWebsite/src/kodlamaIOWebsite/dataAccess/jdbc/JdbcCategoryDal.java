package kodlamaIOWebsite.dataAccess.jdbc;

import kodlamaIOWebsite.dataAccess.CategoryDal;
import kodlamaIOWebsite.entities.Category;

public class JdbcCategoryDal implements CategoryDal {

	@Override
	public void add(Category t) {
		System.out.println("Category is added with JDBC : " + t.toString());
	}

	@Override
	public void update(Category t) {
		System.out.println("Category is updated with JDBC : " + t.toString());
	}

	@Override
	public void delete(Category t) {
		System.out.println("Category is deleted with JDBC : " + t.toString());
	}
}
