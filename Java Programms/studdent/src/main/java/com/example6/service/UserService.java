package com.example6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example6.entity.User;
import com.example6.repository.UserJpa;

import jakarta.transaction.Transactional;


@Service
public class UserService 
{
	@Autowired
	private UserJpa userdao;
	
	@Transactional
	public List<User> getAllUsers()
	{
		List<User> users=userdao.findAll();
		return users;
	}
	
	@Transactional
	public User getById(int id,User user) 
	{
		user=userdao.findById(id).get();
		return user;
	}
	
	@Transactional
	public User updateuser(int id,User user) 
	{
		try {
		User upuser=userdao.findById(id).get();
		if(user.getPhno()!=null){
			user.setPhno(user.getPhno());
		}
		if(user.getAddress()!=null){
			user.setAddress(user.getAddress());
		}
		if(user.getEmail()!=null) {
			user.setEmail(user.getEmail());
		}
		if(user.getUsername()!=null) {
			user.setUsername(user.getUsername());
		}
		if(user.getPassword()!=null) {
			user.setPassword(user.getPassword());
		}
		userdao.save(upuser);
		return upuser;
		}catch(Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}
	
	@Transactional
	public User updateroleandstatus(int id, User user) {
		try {
			User suser=userdao.findById(id).get();
			if(user.getRole()!=null) {
				user.setRole(user.getRole());
			}
			if(user.getStatus()!=null) {
				user.setStatus(user.getStatus());
			}
			userdao.save(suser);
			return suser;
		}catch(Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}
	
	@Transactional
	public void removeuser(int id) {
		try 
    	{
			userdao.deleteById(id);
    		throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}		
	}
	
	/*@Transactional
	public User login(String userName, String userPassword) 
	{
		 User user=userdao.findByUserNameAndPassword(userName, userPassword);
		 return user;
	}*/
	
	@Transactional
	public User adduser(User user) {
		userdao.save(user);
		return user;
	}

}
