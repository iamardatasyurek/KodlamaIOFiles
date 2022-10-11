package kodlamaIOWebsite;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOWebsite.bussiness.*;
import kodlamaIOWebsite.core.logging.*;
import kodlamaIOWebsite.dataAccess.hibernate.*;
import kodlamaIOWebsite.dataAccess.jdbc.*;
import kodlamaIOWebsite.entities.*;

public class Main {

	public static void main(String[] args) throws Exception {
		List<Logger> loggers = new ArrayList<Logger>();
		loggers.add(new FileLogger());
		loggers.add(new DatabaseLogger());
		loggers.add(new MailLogger());
		
		BaseManager<Category> categoriesManager = new CategoriesManager(new HibernateCategoryDal(), loggers) ;
		BaseManager<Educator> educatorsManager = new EducatorsManager(new HibernateEducatorDal(), loggers) ;
		BaseManager<Course> coursesManager = new CoursesManager(new JdbcCourseDal(), loggers) ;
		
		Category backend = new Category("Backend Developer");
		categoriesManager.add(backend);
		System.out.println("-------------------------------------------------");
		
		Educator enginDemirog = new Educator("Engin", "Demirog");
		educatorsManager.add(enginDemirog);
		System.out.println("-------------------------------------------------");
		
		Course java = new Course("(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVAu", "", enginDemirog, backend, 10);
		coursesManager.add(java);
		System.out.println("-------------------------------------------------");
		
		Course dotNet = new Course("Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)", "Senior Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.", enginDemirog, backend, 10);
		coursesManager.add(dotNet);
		System.out.println("-------------------------------------------------");
		
		Category frontend = new Category("Frontend Developer");
		categoriesManager.add(frontend);
		System.out.println("-------------------------------------------------");
		
		Course javaScript = new Course("Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", "1,5 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını", enginDemirog, frontend, 10);
		coursesManager.add(javaScript);
		System.out.println("-------------------------------------------------");
		
		for (Course course : coursesManager.getItem()) {
			System.out.println(course.getId()+" - "+course.getName());
		}
		System.out.println("-------------------------------------------------");
		coursesManager.update(dotNet);
		coursesManager.delete(dotNet);
		System.out.println("-------------------------------------------------");
		for (Course course : coursesManager.getItem()) {
			System.out.println(course.getId()+" - "+course.getName());
		}
	}
}