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
		this.item.add(t);
		this.genericDal.add(t);
		for (Logger logger : loggers) {
			logger.log(t.getFirstName()+ " " + t.getLastName());
		}
	}

}
