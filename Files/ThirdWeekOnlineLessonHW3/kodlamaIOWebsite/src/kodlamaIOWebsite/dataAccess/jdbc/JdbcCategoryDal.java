package kodlamaIOWebsite.dataAccess.jdbc;

import kodlamaIOWebsite.dataAccess.CategoryDal;
import kodlamaIOWebsite.entities.Category;

public class JdbcCategoryDal implements CategoryDal {

	@Override
	public void add(Category entity) {
		System.out.println("Category is added with JDBC : " + entity.toString());
	}

	@Override
	public void update(Category entity) {
		System.out.println("Category is updated with JDBC : " + entity.toString());
	}

	@Override
	public void delete(Category entity) {
		System.out.println("Category is deleted with JDBC : " + entity.toString());
	}
}
