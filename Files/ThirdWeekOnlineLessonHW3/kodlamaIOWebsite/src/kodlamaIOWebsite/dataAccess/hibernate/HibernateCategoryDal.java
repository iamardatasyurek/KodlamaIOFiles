package kodlamaIOWebsite.dataAccess.hibernate;

import kodlamaIOWebsite.dataAccess.CategoryDal;
import kodlamaIOWebsite.entities.Category;

public class HibernateCategoryDal implements CategoryDal {

	@Override
	public void add(Category entity) {
		System.out.println("Category is added with Hibernate : " + entity.toString());
	}

	@Override
	public void update(Category entity) {
		System.out.println("Category is updated with Hibernate : " + entity.toString());
	}

	@Override
	public void delete(Category entity) {
		System.out.println("Category is deleted with Hibernate : " + entity.toString());
	}

}