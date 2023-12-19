package com.example6.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example6.entity.Cart;
import com.example6.repository.CartJpa;

import jakarta.transaction.Transactional;


@Service
public class CartService {
	
	@Autowired
	private CartJpa cartdao;
	
	@Transactional
	public List<Cart> getAllCar(){
		List<Cart> cart=cartdao.findAll();
		return cart;
	}
	
	@Transactional
	public Cart getById(int id) {
		Cart cart=cartdao.findById(id).get();
		return cart;
	}
	
	@Transactional
	public void deleteCart(int id) {
		try {
			cartdao.deleteById(id);
			throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}	
	}
	
	@Transactional
	public Cart addcart(Cart cart) {
		cartdao.save(cart);
		return cart;
	}
	
	@Transactional
	public Cart admincart(int id,Cart cart) {
		try {
			Cart upcart=cartdao.findById(id).get();
			if(cart.getProduct()!=null) {
				upcart.setProduct(cart.getProduct());
			}
			if(cart.getUser()!=null) {
				upcart.setUser(cart.getUser());
			}
			cartdao.save(upcart);
			return upcart;
		}catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}
	}
	
	@Transactional
	public Cart usercart(int id,Cart cart) {
		try {
			Cart upcart=cartdao.findById(id).get();
			if(cart.getProduct()!=null) {
				upcart.setProduct(cart.getProduct());
			}
			cartdao.save(upcart);
			return upcart;
		}catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}
	}
}
