package com.example6.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example6.entity.Products;
import com.example6.repository.ProductsJpa;

import jakarta.transaction.Transactional;




@Service
public class ProductService {
	@Autowired
	private ProductsJpa productdao;
	
	@Transactional
	public ArrayList<Products> getproducts() {
		try 
    	{
			List<Products> productList=productdao.findAll();
		   	ArrayList<Products> products=new ArrayList<>(productList);
		   	return products;
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}
		
	}
	
	@Transactional
	public Products getproductById(int productId) {
		try 
    	{
			Products product=productdao.findById(productId).get();
			return product;
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}
	}

	@Transactional
	public Products addproduct(Products product) {
		productdao.save(product);
    	return product;
	}

	@Transactional
	public Products updateproduct(int productId, Products product) {
		try 
    	{
			Products newproduct=productdao.findById(productId).get();
    		if(product.getName()!=null)
        	{
        		newproduct.setName(product.getName());
        	}
    		if(product.getCategory()!=null) 
    		{
    			newproduct.setCategory(product.getCategory());
    		}
        	if(product.getPrice() != null) 
        	{
        		newproduct.setPrice(product.getPrice());
        	}
        	if(product.getUser()!=null) {
        		newproduct.setName(product.getName());
        	}
        	productdao.save(newproduct);
        	return newproduct;
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}
	}

	@Transactional
	public void deleteproduct(int productId) {
		try 
    	{
    		 productdao.deleteById(productId);
    		 throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}	
		
	}
}
