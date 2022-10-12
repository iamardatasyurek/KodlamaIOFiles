package kodlamaIOWebsite.bussiness;

import kodlamaIOWebsite.entities.Entity;

public interface Validator {
	<T extends Entity> void validate(T entity) throws Exception; 
}
