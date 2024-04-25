package com.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Employee_Driver {

	public static void main(String[] args) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Employee e1=new Employee();
		e1.setId(106);
		e1.setName("shaikh");
		e1.setDesignation("Hr");
		e1.setSalary(76863);
		
		Employee e2=new Employee();
		e2.setId(107);
		e2.setName("Hello");
		e2.setDesignation("Hr");
		e2.setSalary(76863);
		
		Employee e3=new Employee();
		e3.setId(108);
		e3.setName("shaikh");
		e3.setDesignation("Hr");
		e3.setSalary(76863);
		
		Employee e4=new Employee();
		e4.setId(109);
		e4.setName("Hello");
		e4.setDesignation("Hr");
		e4.setSalary(76863);
		
		transaction.begin();
		manager.persist(e1);
		manager.persist(e2);
		manager.persist(e3);
		manager.persist(e4);
		transaction.commit();
		

	}

}
