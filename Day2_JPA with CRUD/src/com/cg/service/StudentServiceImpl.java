package com.cg.service;

import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaoImpl;
import com.cg.entities.Student;

public class StudentServiceImpl implements StudentService{

	private StudentDao dao;
	public StudentServiceImpl(){
		super();
	dao = new StudentDaoImpl();
	}
		
	@Override
	public void addStudent(Student s) {
		dao.beginTransaction();
		dao.addStudent(s);
		dao.commitTransaction();
		
	}

	@Override
	public void updateStudent(Student s) {
		dao.beginTransaction();
		dao.updateStudent(s);
		dao.commitTransaction();
		
	}

	@Override
	public void deleteStudent(Student s) {
		dao.beginTransaction();
		dao.deleteStudent(s);
		dao.commitTransaction();
	}

	@Override
	public Student getStudentById(int rollno) {
		Student s=dao.getStudentById(rollno);
		return s;
	}
	
	
}