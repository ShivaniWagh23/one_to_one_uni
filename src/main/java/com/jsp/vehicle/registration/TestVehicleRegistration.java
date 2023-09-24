package com.jsp.vehicle.registration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestVehicleRegistration {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Registration registration=new Registration();
	registration.setCity("Pune");
	registration.setRegisteration_no(203);
	
	
	Vehicle vehicle=new Vehicle();
	vehicle.setColor("black");
	vehicle.setBrand("none");
	vehicle.setName("youur");
	vehicle.setPrice(784524114);
	vehicle.setRegistration(registration);
	
	
	entityTransaction.begin();
	entityManager.persist(vehicle);
	entityManager.persist(registration);
	entityTransaction.commit();
}
}
