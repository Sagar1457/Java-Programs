package com.example6.service;

import java.util.List;

import com.example6.entity.Student;
import com.example6.DTO.StudentDTO;

public interface StudentService 
{
	StudentDTO createStudent(Student student);
	List<StudentDTO> getAllStudents();
	StudentDTO getStudentById(int id);
	StudentDTO updateStudent(int id,Student student);
	String deleteStudent(int id);
}
