package kodlamaIOWebsite.dataAccess;

import kodlamaIOWebsite.entities.Educator;

public class HibernateEducatorDal implements EducatorDal{

	@Override
	public void add(Educator t) {
		System.out.println("Educator is added with Hibernate : " + t.getFirstName() + " " + t.getLastName());	
	}

	@Override
	public void update(Educator t) {
		System.out.println("Educator is updated with Hibernate : " + t.getFirstName() + " " + t.getLastName());		
	}

	@Override
	public void delete(Educator t) {
		System.out.println("Educator is deleted with Hibernate : " + t.getFirstName() + " " + t.getLastName());
	}

}

