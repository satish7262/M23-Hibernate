package com.cg.service;
import com.cg.entities.Student;

public interface StudentService 
{
	//abstract method by default
	public abstract void addStudent(Student s);
	public abstract void updateStudent(Student s);
	public abstract void deleteStudent(Student s);
	public abstract Student getStudentById(int rollno);

}


