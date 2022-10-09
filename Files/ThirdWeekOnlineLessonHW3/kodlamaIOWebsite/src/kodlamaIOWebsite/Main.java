package kodlamaIOWebsite;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOWebsite.bussiness.*;
import kodlamaIOWebsite.core.logging.*;
import kodlamaIOWebsite.dataAccess.*;
import kodlamaIOWebsite.entities.*;

public class Main {

	public static void main(String[] args) throws Exception {
		List<Logger> loggers = new ArrayList<Logger>();
		loggers.add(new FileLogger());
		loggers.add(new DatabaseLogger());
		loggers.add(new MailLogger());
		
		BaseManager<Category> categoriesManager = new CategoriesManager(new HibernateCategoryDal(), loggers) ;
		BaseManager<Educator> educatorsManager = new EducatorsManager(new HibernateEducatorDal(), loggers) ;
		BaseManager<Course> coursesManager = new CoursesManager(new HibernateCourseDal(), loggers) ;
		
		Category backend = new Category(1,"Backend Developer");
		categoriesManager.add(backend);
		
		Educator enginDemirog = new Educator(1, "Engin", "Demirog");
		educatorsManager.add(enginDemirog);
		
		Course java = new Course(1, "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVAu", "", enginDemirog, backend, 10);
		coursesManager.add(java);
		
		Course dotNet = new Course(2, "Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)", "Senior Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.", enginDemirog, backend, 10);
		coursesManager.add(dotNet);
		
		Category frontend = new Category(2,"Frontend Developer");
		categoriesManager.add(frontend);
		
		Course javaScript = new Course(3, "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", "1,5 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını", enginDemirog, frontend, 10);
		coursesManager.add(javaScript);
		
	}
	
}