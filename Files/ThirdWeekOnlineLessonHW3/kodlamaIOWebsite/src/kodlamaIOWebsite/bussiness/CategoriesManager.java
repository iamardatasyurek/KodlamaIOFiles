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
		for (Category category : item) {
			if(t.getName() == category.getName()) {
				isExist = true;
				throw new Exception("The category with this name already exists.");
			} 
		}
		if(!isExist) {
			this.item.add(t);
			this.genericDal.add(t);
			for (Logger logger : loggers) {
				logger.log(t.getName());
			}
		}
	}

}
