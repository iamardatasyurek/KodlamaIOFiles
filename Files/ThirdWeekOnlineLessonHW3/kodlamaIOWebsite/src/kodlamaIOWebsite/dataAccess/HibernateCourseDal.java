package kodlamaIOWebsite.dataAccess;

import kodlamaIOWebsite.entities.Course;

public class HibernateCourseDal implements CourseDal{

	@Override
	public void add(Course t) {
		System.out.println("Course is added with Hibernate : " + t.getName());		
	}

	@Override
	public void update(Course t) {
		System.out.println("Course is updated with Hibernate : " + t.getName());	
	}

	@Override
	public void delete(Course t) {
		System.out.println("Course is deleted with Hibernate : " + t.getName());
	}

}
