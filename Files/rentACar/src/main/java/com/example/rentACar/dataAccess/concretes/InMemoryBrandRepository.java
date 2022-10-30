package com.example.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.rentACar.dataAccess.abstracts.BrandRepository;
import com.example.rentACar.entities.concretes.Brand;

@Repository
public class InMemoryBrandRepository implements BrandRepository{

	private List<Brand> brands;
	
	public InMemoryBrandRepository() {
		this.brands = new ArrayList<Brand>();
		brands.add(new Brand(1,"BMW"));
		brands.add(new Brand(2,"AUDI"));
		brands.add(new Brand(3,"VOLVO"));
		brands.add(new Brand(4,"MERCEDES"));
		brands.add(new Brand(5,"NISSAN"));
	}
	
	@Override
	public List<Brand> getAll() {
		return brands;
	}
}
