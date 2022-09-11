package com.cg.dao;
import com.cg.entities.Student;

public interface StudentDao 
{
	//abstract method by default
	public abstract Student getStudentById(int rollno);
	public abstract void addStudent(Student s);
	public abstract void deleteStudent(Student s);
	public abstract void updateStudent(Student s);

	public abstract void commitTransaction();
	public abstract void beginTransaction();
}