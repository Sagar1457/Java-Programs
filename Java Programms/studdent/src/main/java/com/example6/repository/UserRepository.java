package com.example6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example6.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>
{
       User findByUserNameAndPassword(String userName, String password);
}
