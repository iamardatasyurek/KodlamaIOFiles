package kodlamaIOWebsite.bussiness;

import java.util.List;

import kodlamaIOWebsite.core.logging.Logger;
import kodlamaIOWebsite.dataAccess.GenericDal;
import kodlamaIOWebsite.entities.Educator;

public class EducatorManager extends BaseManager<Educator>{
	
	public EducatorManager(GenericDal<Educator> genericDal, List<Logger> loggers) {
		super(genericDal, loggers);
	}

	@Override
	public void add(Educator entity) {
		this.listOfEntities.add(entity);
		this.genericDal.add(entity);
		for (Logger logger : loggers) {
			logger.log(entity.toString());
		}
		
		//other operations
	}

	@Override
	public void update(Educator entity){
		System.out.println(entity.toString()+" is updated");
		this.genericDal.update(entity);
		
		//other operations
	}

	@Override
	public void delete(Educator entity) {
		System.out.println(entity.toString()+" is deleted");
		this.genericDal.delete(entity);
		this.listOfEntities.remove(entity);
		
		//other operations
	}
}
