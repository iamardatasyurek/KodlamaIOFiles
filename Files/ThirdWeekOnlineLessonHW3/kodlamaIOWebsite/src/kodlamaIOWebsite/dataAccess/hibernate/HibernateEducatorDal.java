package kodlamaIOWebsite.dataAccess.hibernate;

import kodlamaIOWebsite.dataAccess.EducatorDal;
import kodlamaIOWebsite.entities.Educator;

public class HibernateEducatorDal implements EducatorDal{

	@Override
	public void add(Educator t) {
		System.out.println("Educator is added with Hibernate : " + t.toString());	
	}

	@Override
	public void update(Educator t) {
		System.out.println("Educator is updated with Hibernate : " + t.toString());		
	}

	@Override
	public void delete(Educator t) {
		System.out.println("Educator is deleted with Hibernate : " + t.toString());
	}

}

