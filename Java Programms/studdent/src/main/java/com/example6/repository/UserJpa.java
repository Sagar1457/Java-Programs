package com.example6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example6.entity.User;



@Repository
public interface UserJpa extends JpaRepository<User, Integer> {
	/*User findByUserNameAndPassword(String username, String password);*/
}
