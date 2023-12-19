package com.example6.DTO;

import java.util.List;

import com.example6.entity.Student;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeacherDTO
{
    private String name;
	
	private String address;
	
	private String phNo;
	private boolean status=Boolean.TRUE;
	

	List<Student> students;
}
