package kodlamaIOWebsite.dataAccess.hibernate;

import kodlamaIOWebsite.dataAccess.EducatorDal;
import kodlamaIOWebsite.entities.Educator;

public class HibernateEducatorDal implements EducatorDal{

	@Override
	public void add(Educator entity) {
		System.out.println("Educator is added with Hibernate : " + entity.toString());	
	}

	@Override
	public void update(Educator entity) {
		System.out.println("Educator is updated with Hibernate : " + entity.toString());		
	}

	@Override
	public void delete(Educator entity) {
		System.out.println("Educator is deleted with Hibernate : " + entity.toString());
	}

}

