package kodlamaIOWebsite.dataAccess.hibernate;

import kodlamaIOWebsite.dataAccess.CourseDal;
import kodlamaIOWebsite.entities.Course;

public class HibernateCourseDal implements CourseDal{

	@Override
	public void add(Course entity) {
		System.out.println("Course is added with Hibernate : " + entity.toString());		
	}

	@Override
	public void update(Course entity) {
		System.out.println("Course is updated with Hibernate : " + entity.toString());	
	}

	@Override
	public void delete(Course entity) {
		System.out.println("Course is deleted with Hibernate : " + entity.toString());
	}

}
