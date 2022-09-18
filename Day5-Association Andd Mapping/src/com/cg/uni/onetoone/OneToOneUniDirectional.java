package com.cg.uni.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//Program on OneToOne uniDirectional
public class OneToOneUniDirectional {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Student s=new Student();
		s.setRollno(101);
		s.setName("Akshay");
		s.setPercentage(85.5f);
		
		Address a=new Address();
		a.setStreetno(24);
		a.setArea("KarveNagar");
		a.setCity("Pune");
		a.setState("Maharashtra");
		
		s.setAddress(a);
		
		em.persist(s);

		System.out.println("Rows are inserted");
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	

}
