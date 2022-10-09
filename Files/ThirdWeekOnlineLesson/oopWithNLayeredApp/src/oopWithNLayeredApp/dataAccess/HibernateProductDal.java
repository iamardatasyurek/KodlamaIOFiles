package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDal implements ProductDal{
	public void add(Product product) {
		System.out.println("Product is added with Hibernate to Database. : " + product.getName());
	}
}
