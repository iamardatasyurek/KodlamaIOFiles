package kodlamaIOWebsite.bussiness;

import java.util.List;

import kodlamaIOWebsite.core.logging.Logger;
import kodlamaIOWebsite.dataAccess.GenericDal;
import kodlamaIOWebsite.entities.Educator;

public class EducatorsManager extends BaseManager<Educator>{
	
	public EducatorsManager(GenericDal<Educator> genericDal, List<Logger> loggers) {
		super(genericDal, loggers);
	}

	@Override
	public void add(Educator t) {
		this.items.add(t);
		this.genericDal.add(t);
		for (Logger logger : loggers) {
			logger.log(t.toString());
		}
		
		//other operations
	}

	@Override
	public void update(Educator t){
		System.out.println(t.toString()+" is updated");
		this.genericDal.update(t);
		
		//other operations
	}

	@Override
	public void delete(Educator t) {
		System.out.println(t.toString()+" is deleted");
		this.genericDal.delete(t);
		this.items.remove(t);
		
		//other operations
	}
}
