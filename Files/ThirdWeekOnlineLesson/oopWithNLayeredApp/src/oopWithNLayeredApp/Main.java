package oopWithNLayeredApp;

import java.util.*;

import oopWithNLayeredApp.bussiness.ProductManager;
import oopWithNLayeredApp.core.logging.*;
import oopWithNLayeredApp.dataAccess.*;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "Iphone 11", 1000);
		List<Logger> loggers = new ArrayList<Logger>();
		loggers.add(new DatabaseLogger());
		loggers.add(new FileLogger());
		loggers.add(new MailLogger());
		ProductManager productManager = new ProductManager(new HibernateProductDal(),loggers);
		productManager.add(product1);
	}

}
