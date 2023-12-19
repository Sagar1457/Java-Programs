package com.example6.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example6.entity.Cart;
import com.example6.entity.Category;
import com.example6.entity.Products;
import com.example6.entity.User;
import com.example6.service.CartService;
import com.example6.service.CategoryService;
import com.example6.service.ProductService;
import com.example6.service.UserService;





@RestController
@RequestMapping("/admin")
public class Admincontroller {

	@Autowired
	private CategoryService categoryservice;
	
	@GetMapping(path="/categories")
	public List<Category> getCategories()
	{ 
		return categoryservice.getCategories();
	}
	
	@PostMapping(path="/categories")
	public Category addCategory(@RequestBody Category category)
	{
		return categoryservice.addCategory(category);
		
	}
	
	@DeleteMapping(path="/categories/{id}")
	public void deletCategory(@PathVariable("id") int id) 
	{
		 categoryservice.deletCategory(id);
	}
	
	@PutMapping(path="/categories/{id}")
	public Category updateCategory(@PathVariable("id") int id, @RequestBody Category category)
	{
		return categoryservice.updateCategory(id, category);
	}
	
	@GetMapping(path="/categories/{id}")
	public Category getCategory(@PathVariable("id") int id) 
	{
		return categoryservice.getCategory(id);}
	//-------------------------------//product controller--------------------------------
		@Autowired
	    public ProductService productService;
	   
	    @GetMapping("/products")
		public ArrayList<Products> getproducts()
		{
			return productService.getproducts();
		}
	    
	    @GetMapping("/products/{productId}")
	    public Products getproductById(@PathVariable("productId") int productId)
	    {
	    	return productService.getproductById(productId);
	    }
	    
	    @PostMapping("/products")
	    public Products addproduct(@RequestBody Products product)
	    {
	       return productService.addproduct(product);	
	    }
	    
	    @PutMapping("/products/{productId}")
	    public Products updateproduct(@PathVariable("productId") int productId, @RequestBody Products product)
	    {
	    	return productService.updateproduct(productId, product);
	    }
	    
	    @DeleteMapping("/products/{productId}")
	    public void deleteproduct(@PathVariable("productId") int productId)
	    {
	    	productService.deleteproduct(productId);
	    }
	 //--------------------------------------------------Cart Controller--------------------------------
	    @Autowired
	    public CartService cartservice;
	    
	    @GetMapping("/cart")
	    public List<Cart> getAllCar()
		{
			return cartservice.getAllCar();
		}
	    
	    @GetMapping("/cart/{id}")
	    public Cart getById(@PathVariable("id") int id)
	    {
	    	return cartservice.getById(id);
	    }
	    
	    @PutMapping("/updatecart/{id}")
	     public Cart admincart(@PathVariable("id")int id,Cart cart)
	    {
	       return cartservice.admincart(id, cart);
	    }
	    
	    @PostMapping("/carts")
	    public Cart addcart(@RequestBody Cart cart)
	    {
	    	return cartservice.addcart(cart);
	    }
	    
	    @DeleteMapping("/cart/{Id}")
	    public void removecart(@PathVariable("Id") int Id){
	    	cartservice.deleteCart(Id);
	    }

	  //---------------------users-------------------------------------
	    @Autowired
	    private UserService userservice;
	    
	    @GetMapping("/users")
	    public List<User> getAllUsers(){
	    	return userservice.getAllUsers();
	    }
}
