package com.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update_Employee {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Employee e=manager.find(Employee.class, 105);
		
		if(e!=null)
		{
			transaction.begin();
			e.setName("NEW Employee");
			e.setSalary(74823.323);
			manager.merge(e);
			transaction.commit();
		}
		else {
			System.out.println("Employee Not Found");
		}
		
				

	}

}
