package com.cg.client;

import com.cg.entites.Certificate;
import com.cg.entites.College;
import com.cg.entites.Student;
import com.cg.entites.User;
import com.cg.service.CertificateServiceImp;
import com.cg.service.CollegeServiceImp;
import com.cg.service.ICertificateService;
import com.cg.service.ICollegeService;
import com.cg.service.IStudentService;
import com.cg.service.IUserService;
import com.cg.service.StudentServiceImp;
import com.cg.service.UserServiceImp;

public class Client {

	public static void main(String[] args) 
	{
		IStudentService studentService = new StudentServiceImp();
		ICollegeService collegeService = new CollegeServiceImp();
		IUserService userService = new UserServiceImp();
		ICertificateService certificateService = new CertificateServiceImp();
		
		College collegeJSPM = new College();
		collegeJSPM.setCollegeName("JSPM");
		collegeJSPM.setLocation("Pune");
		collegeService.addCollege(collegeJSPM);
		
		User user = new User();
		user.setName("Vishal");
		user.setPassword("FTAR565$34");
		user.setType("System User");
		user.setCollege(collegeJSPM);
		userService.addNewUser(user);
		
		
		collegeJSPM.setUser(user);
		collegeService.updateColleget(collegeJSPM);	
		
			
		Student studentAkshay=new Student();
		studentAkshay.setName("Akshay");
		studentAkshay.setRollno(101);
		studentAkshay.setQualification("BE");
		studentAkshay.setCollege(collegeJSPM);
		studentAkshay.setCourses("E&TC");
		studentAkshay.setHallTicketNo(4045);
		studentAkshay.setYear(2022);
		studentService.addStudent(studentAkshay);
	
		
		Certificate certificate = new Certificate();
		certificate.setStudent(studentAkshay);
		certificate.setCollege(collegeJSPM);
		certificate.setYear(2022);
		certificateService.addCertificate(certificate);
		
		studentAkshay.setCertificate(certificate);
		studentService.updateStudent(studentAkshay);
		System.out.println("The Data is added");
	}

}

