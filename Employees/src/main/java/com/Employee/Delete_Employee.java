package com.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete_Employee {

	public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction =manager.getTransaction();
	
	Employee e=manager.find(Employee.class, 109);
	
	if(e!=null)
	{
		transaction.begin();
		manager.remove(e);
		transaction.commit();
	}
	else {
		System.out.println("Employee Not Found");
	}

	}

}
