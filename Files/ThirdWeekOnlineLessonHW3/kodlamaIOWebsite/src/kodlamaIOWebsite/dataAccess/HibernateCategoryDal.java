package kodlamaIOWebsite.dataAccess;

import kodlamaIOWebsite.entities.Category;

public class HibernateCategoryDal implements CategoryDal {

	@Override
	public void add(Category t) {
		System.out.println("Category is added with Hibernate : " + t.getName());
	}

	@Override
	public void update(Category t) {
		System.out.println("Category is updated with Hibernate : " + t.getName());
	}

	@Override
	public void delete(Category t) {
		System.out.println("Category is deleted with Hibernate : " + t.getName());
	}

}