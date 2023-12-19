package com.example6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example6.entity.Cart;



@Repository
public interface CartJpa extends JpaRepository<Cart, Integer>{
	
}
