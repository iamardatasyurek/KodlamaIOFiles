package kodlamaIOWebsite.bussiness;

import java.util.List;

import kodlamaIOWebsite.core.logging.Logger;
import kodlamaIOWebsite.dataAccess.GenericDal;
import kodlamaIOWebsite.entities.Course;
import kodlamaIOWebsite.entities.Entity;

public class CourseManager extends BaseManager<Course> implements Validator{

	public CourseManager(GenericDal<Course> genericDal, List<Logger> loggers) {
		super(genericDal, loggers);
	}

	@Override
	public void add(Course entity) throws Exception {
		for (Course course : listOfEntities) {
			if(entity.getName() == course.getName()) {
				throw new Exception("The course with this name already exists.");
			} 
		}
		
		if(entity.getPrice() < 0) throw new Exception("Price of the course has to be higher than 0$.");
		
		entity.getEducator().getCourses().add(entity);
		entity.getCategory().getCourses().add(entity);
		this.listOfEntities.add(entity);
		this.genericDal.add(entity);
		for (Logger logger : loggers) {
				logger.log(entity.toString());
		}
			
		//other operations
		
	}

	@Override
	public void update(Course entity){
		System.out.println(entity.toString()+" is updated");
		this.genericDal.update(entity);
		
		//other operations
	}

	@Override
	public void delete(Course entity) {
		System.out.println(entity.toString()+" is deleted");
		this.genericDal.delete(entity);
		this.listOfEntities.remove(entity);
		
		//other operations
	}

	@Override
	public <T extends Entity> void validate(T entity) throws Exception {
		for (Course course : listOfEntities) {
			if(((Course) entity).getName() == course.getName()) {
				throw new Exception("The course with this name already exists.");
			} 
		}
		
		if(((Course) entity).getPrice() < 0) throw new Exception("Price of the course has to be higher than 0$.");
	}
}
