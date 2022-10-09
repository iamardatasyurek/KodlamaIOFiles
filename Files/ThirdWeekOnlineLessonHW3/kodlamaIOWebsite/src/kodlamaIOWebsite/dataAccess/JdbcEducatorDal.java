package kodlamaIOWebsite.dataAccess;

import kodlamaIOWebsite.entities.Educator;

public class JdbcEducatorDal implements EducatorDal{

	@Override
	public void add(Educator t) {
		System.out.println("Educator is added with JDBC : " + t.getFirstName() + " " + t.getLastName());	
	}

	@Override
	public void update(Educator t) {
		System.out.println("Educator is updated with JDBC : " + t.getFirstName() + " " + t.getLastName());		
	}

	@Override
	public void delete(Educator t) {
		System.out.println("Educator is deleted with JDBC : " + t.getFirstName() + " " + t.getLastName());
	}

}
