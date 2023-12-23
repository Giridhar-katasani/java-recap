package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repositary.ProductRepositary;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepositary repositary;
	
	public Product saveProduct(Product product) {
		return repositary.save(product);
	}

	public List<Product> saveProduct(List<Product> product) {
		return repositary.saveAll(product);
	}
	
	public List<Product> getProducts() {
		return repositary.findAll();
	}
	
	public Product getProductById(Integer id) {
		return repositary.getReferenceById(id);
	}
	
	public String deleteProductById(Integer id) {
		 repositary.deleteById(id);
		 return "delete sucessfully";
	}
}
