package kodlamaIOWebsite.dataAccess.jdbc;

import kodlamaIOWebsite.dataAccess.CourseDal;
import kodlamaIOWebsite.entities.Course;

public class JdbcCourseDal implements CourseDal{

	@Override
	public void add(Course t) {
		System.out.println("Course is added with JDBC : " + t.toString());		
	}

	@Override
	public void update(Course t) {
		System.out.println("Course is updated with JDBC : " + t.toString());	
	}

	@Override
	public void delete(Course t) {
		System.out.println("Course is deleted with JDBC : " + t.toString());
	}

}
