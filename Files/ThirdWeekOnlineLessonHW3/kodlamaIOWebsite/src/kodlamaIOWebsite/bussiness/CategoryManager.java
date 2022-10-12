package kodlamaIOWebsite.bussiness;

import java.util.List;

import kodlamaIOWebsite.core.logging.Logger;
import kodlamaIOWebsite.dataAccess.*;
import kodlamaIOWebsite.entities.Category;

public class CategoryManager extends BaseManager<Category> implements Validator<Category>{

	public CategoryManager(GenericDal<Category> genericDal, List<Logger> loggers) {
		super(genericDal, loggers);
	}

	@Override
	public void add(Category entity) throws Exception {
		validate(entity);
		
		this.listOfEntities.add(entity);
		this.genericDal.add(entity);
		for (Logger logger : loggers) {
				logger.log(entity.toString());
		}
		//other operations
	}

	@Override
	public void update(Category entity) {
		System.out.println(entity.toString()+" is updated");
		this.genericDal.update(entity);
		
		//other operations
	}

	@Override
	public void delete(Category entity) {
		System.out.println(entity.toString()+" is deleted");
		this.genericDal.delete(entity);
		this.listOfEntities.remove(entity);
		
		//other operations
	}

	

	@Override
	public void validate(Category entity) throws Exception {
		for (Category category : listOfEntities) {
			if(entity.getName() == category.getName()) {
				throw new Exception("The category with this name already exists.");
			} 
		}
	}
}
