package com.cg.client;

import com.cg.entities.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client 
{
	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();
		Student s = new Student();
		
		//create operation
		s.setRollno(102);
		s.setName("Amol kalubarme");
		service.addStudent(s); 
		
		/*//retrieve
		s=service.getStudentById(110);
		System.out.println("Student Roll No: "+s.getRollno());
		System.out.println("Student Roll No: "+s.getName()); */
		
		/*//update
		s=service.getStudentById(110);
		s.setName("Amol kalubarme");
		service.updateStudent(s);*/
		
		/*//delete
		s=service.getStudentById(110);
		service.deleteStudent(s);
		System.out.println("Data is deleted");*/
		
	}
}