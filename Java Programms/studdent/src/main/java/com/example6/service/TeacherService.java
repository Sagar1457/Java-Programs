package com.example6.service;

import com.example6.entity.Teacher;
import com.example6.DTO.TeacherDTO;

public interface TeacherService
{
	TeacherDTO	registerTeacher(Teacher teacher);
	String assignStudentToTeacher(int tid,int sid);
}
