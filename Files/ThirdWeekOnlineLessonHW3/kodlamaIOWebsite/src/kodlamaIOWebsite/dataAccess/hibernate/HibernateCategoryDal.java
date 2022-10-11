package kodlamaIOWebsite.dataAccess.hibernate;

import kodlamaIOWebsite.dataAccess.CategoryDal;
import kodlamaIOWebsite.entities.Category;

public class HibernateCategoryDal implements CategoryDal {

	@Override
	public void add(Category t) {
		System.out.println("Category is added with Hibernate : " + t.toString());
	}

	@Override
	public void update(Category t) {
		System.out.println("Category is updated with Hibernate : " + t.toString());
	}

	@Override
	public void delete(Category t) {
		System.out.println("Category is deleted with Hibernate : " + t.toString());
	}

}