package com.cg.service;

import com.cg.entites.Student;

public interface IStudentService 
{
	public abstract Student addStudent(Student student);
	public abstract Student updateStudent(Student student);
	public abstract Student searchStudentById(int id);
	public abstract Student SearchStudentByHallTicket(int hallticketno);
	public abstract boolean deleteStudent(int id);
	
}
