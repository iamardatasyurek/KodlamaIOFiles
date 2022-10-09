package kodlamaIOWebsite.dataAccess;

import kodlamaIOWebsite.entities.Course;

public class JdbcCourseDal implements CourseDal{

	@Override
	public void add(Course t) {
		System.out.println("Course is added with JDBC : " + t.getName());		
	}

	@Override
	public void update(Course t) {
		System.out.println("Course is updated with JDBC : " + t.getName());	
	}

	@Override
	public void delete(Course t) {
		System.out.println("Course is deleted with JDBC : " + t.getName());
	}

}
