package oopWithNLayeredApp.bussiness;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.*;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDal productDal;
	private List<Logger> loggers;

	public ProductManager(ProductDal productDal, List<Logger> loggers) {
		this.productDal = productDal;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		if(product.getUnitPrice() < 10) {
			throw new Exception("Unit price have to be higher than 10.");
		}
		
		productDal.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}
}
