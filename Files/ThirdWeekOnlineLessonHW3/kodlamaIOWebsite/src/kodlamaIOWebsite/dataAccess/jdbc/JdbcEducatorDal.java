package kodlamaIOWebsite.dataAccess.jdbc;

import kodlamaIOWebsite.dataAccess.EducatorDal;
import kodlamaIOWebsite.entities.Educator;

public class JdbcEducatorDal implements EducatorDal{

	@Override
	public void add(Educator entity) {
		System.out.println("Educator is added with JDBC : " + entity.toString());	
	}

	@Override
	public void update(Educator entity) {
		System.out.println("Educator is updated with JDBC : " + entity.toString());		
	}

	@Override
	public void delete(Educator entity) {
		System.out.println("Educator is deleted with JDBC : " + entity.toString());
	}

}
