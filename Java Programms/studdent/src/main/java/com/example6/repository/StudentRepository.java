package com.example6.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example6.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
