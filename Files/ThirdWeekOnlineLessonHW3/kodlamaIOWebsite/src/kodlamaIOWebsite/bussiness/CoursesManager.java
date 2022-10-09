package kodlamaIOWebsite.bussiness;

import java.util.List;

import kodlamaIOWebsite.core.logging.Logger;
import kodlamaIOWebsite.dataAccess.GenericDal;
import kodlamaIOWebsite.entities.Category;
import kodlamaIOWebsite.entities.Course;

public class CoursesManager extends BaseManager<Course>{

	public CoursesManager(GenericDal<Course> genericDal, List<Logger> loggers) {
		super(genericDal, loggers);
	}

	@Override
	public void add(Course t) throws Exception {
		boolean isExist = false;
		for (Course course : item) {
			if(t.getName() == course.getName()) {
				isExist = true;
				throw new Exception("The course with this name already exists.");
			} 
		}
		
		if(t.getPrice() < 10) throw new Exception("Price of the course has to be higher than 10$.");
		
		if(!isExist) {
			this.item.add(t);
			this.genericDal.add(t);
			t.getEducator().getCourses().add(t);
			t.getCategory().getCourses().add(t);
			for (Logger logger : loggers) {
				logger.log(t.getName());
			}
		}
		
		
	}

}
