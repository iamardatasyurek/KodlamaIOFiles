package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDal implements ProductDal{

	public void add(Product product) {
		System.out.println("Product is added with JDBC to Database. : " + product.getName());	
	}
	
}