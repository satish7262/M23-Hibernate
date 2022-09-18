package com.cg.service;

import com.cg.entites.Student;
import com.cg.dao.IStudentDao;
import com.cg.dao.StudentDaoImp;


public class StudentServiceImp implements IStudentService {
	
	private IStudentDao  dao;
	
	
	public StudentServiceImp() {
		super();
		dao=new StudentDaoImp();
	}


	@Override
	public Student addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		return student;
	}


	@Override
	public Student updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		return student;
	}


	@Override
	public Student searchStudentById(int id) {
		Student student=dao.searchStudentById(id);
		return student ;
	}


	@Override
	public Student SearchStudentByHallTicket(int hallticketno) {
		Student student=dao.searchStudentByHallTicket(hallticketno);
		return student;
	}


	@Override
	public boolean deleteStudent(int id) {
		dao.beginTransaction();
		boolean res=dao.deleteStudent(id);
		dao.commitTransaction();
		return res;
	
		
	}
	

}

