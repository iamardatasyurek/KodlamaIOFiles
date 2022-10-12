package kodlamaIOWebsite.dataAccess.jdbc;

import kodlamaIOWebsite.dataAccess.CourseDal;
import kodlamaIOWebsite.entities.Course;

public class JdbcCourseDal implements CourseDal{

	@Override
	public void add(Course entity) {
		System.out.println("Course is added with JDBC : " + entity.toString());		
	}

	@Override
	public void update(Course entity) {
		System.out.println("Course is updated with JDBC : " + entity.toString());	
	}

	@Override
	public void delete(Course entity) {
		System.out.println("Course is deleted with JDBC : " + entity.toString());
	}

}
