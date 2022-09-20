package com.cg.joinedinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create an employee1
		Employee e=new Employee();
		e.setName("SANDESH");
		e.setSalary(345000);
		em.persist(e);
		
		//create an employee1
		Employee e1=new Employee();
		e1.setName("SUYOG");
		e1.setSalary(29000);
		em.persist(e1);
		
		//create a manager
		Manager m=new Manager();
		m.setName("RAJ");
		m.setSalary(55000);
		m.setDeptname("DEVELOPER");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		factory.close();
		
		
	}
	

}