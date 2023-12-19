package com.example6.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example6.entity.Category;
import com.example6.repository.CategoryJpa;
import com.example6.repository.ProductsJpa;

import jakarta.transaction.Transactional;


@Service
public class CategoryService {
	@Autowired
	CategoryJpa categoryDao;
	
	@Autowired
	ProductsJpa productDao;

	@Transactional
	public List<Category> getCategories() {
		List<Category> categoryList=categoryDao.findAll();
	   	ArrayList<Category> category=new ArrayList<>(categoryList);
	   	return category;
	}

	@Transactional
	public Category addCategory(Category category) {
		categoryDao.save(category);
    	return category;
	}

	@Transactional
	public Category updateCategory(int id, Category category) {
		try 
    	{
			Category newcategory=categoryDao.findById(id).get();
    		if(category.getName()!=null)
        	{
    			newcategory.setName(category.getName());
        	}
    		categoryDao.save(newcategory);
        	return newcategory;
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}
	}

	@Transactional
	public Category getCategory(int id) {
		try 
    	{
			Category category=categoryDao.findById(id).get();
			return category;
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}
	}

	@Transactional
	public void deletCategory(int id) {
		try 
    	{
			 categoryDao.deleteById(id);
    		 throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}	
	}
}
