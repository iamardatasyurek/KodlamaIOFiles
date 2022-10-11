package kodlamaIOWebsite.dataAccess.hibernate;

import kodlamaIOWebsite.dataAccess.CourseDal;
import kodlamaIOWebsite.entities.Course;

public class HibernateCourseDal implements CourseDal{

	@Override
	public void add(Course t) {
		System.out.println("Course is added with Hibernate : " + t.toString());		
	}

	@Override
	public void update(Course t) {
		System.out.println("Course is updated with Hibernate : " + t.toString());	
	}

	@Override
	public void delete(Course t) {
		System.out.println("Course is deleted with Hibernate : " + t.toString());
	}

}
