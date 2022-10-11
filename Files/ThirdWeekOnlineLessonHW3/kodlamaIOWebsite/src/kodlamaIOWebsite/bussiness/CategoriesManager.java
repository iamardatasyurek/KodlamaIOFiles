package kodlamaIOWebsite.bussiness;

import java.util.List;

import kodlamaIOWebsite.core.logging.Logger;
import kodlamaIOWebsite.dataAccess.*;
import kodlamaIOWebsite.entities.Category;

public class CategoriesManager extends BaseManager<Category>{

	public CategoriesManager(GenericDal<Category> genericDal, List<Logger> loggers) {
		super(genericDal, loggers);
	}

	@Override
	public void add(Category t) throws Exception {
		boolean isExist = false;
		for (Category category : items) {
			if(t.getName() == category.getName()) {
				isExist = true;
				throw new Exception("The category with this name already exists.");
			} 
		}
		
		if(!isExist) {
			this.items.add(t);
			this.genericDal.add(t);
			for (Logger logger : loggers) {
				logger.log(t.toString());
			}
			
			//other operations
		}
	}

	@Override
	public void update(Category t) {
		System.out.println(t.toString()+" is updated");
		this.genericDal.update(t);
		
		//other operations
	}

	@Override
	public void delete(Category t) {
		System.out.println(t.toString()+" is deleted");
		this.genericDal.delete(t);
		this.items.remove(t);
		
		//other operations
	}
}
