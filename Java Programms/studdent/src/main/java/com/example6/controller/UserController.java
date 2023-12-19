package com.example6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example6.entity.Cart;
import com.example6.entity.User;
import com.example6.service.CartService;
import com.example6.service.UserService;

import jakarta.servlet.ServletException;


@RestController
@RequestMapping("/user")
public class UserController
{
	@Autowired
	private UserService userservice;
	
	@Autowired
	private CartService cartservice;
	
	@PostMapping("/{id}/updatedetials")
	public User updateuser(@PathVariable("id") int id,@RequestBody User user) {
		return userservice.updateuser(id, user);	
	}
	
	@PostMapping("/login")
	public String validate(@RequestBody User user) throws ServletException
	{return null;}
	
	@PostMapping("/{id}/cart")
	public Cart usercart(@PathVariable("id")int id,@RequestBody Cart cart) {
		return cartservice.usercart(id, cart);
	}
	
	@PostMapping("/user")
	public User adduser(@RequestBody User user) 
	{
		return userservice.adduser(user);
	}
}
