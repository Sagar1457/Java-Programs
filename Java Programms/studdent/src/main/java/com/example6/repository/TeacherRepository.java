package com.example6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example6.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>
{

}
