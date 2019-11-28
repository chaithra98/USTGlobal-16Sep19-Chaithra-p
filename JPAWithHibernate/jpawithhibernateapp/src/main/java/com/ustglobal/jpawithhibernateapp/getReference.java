package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class getReference {

	public static void main(String[] args) {

		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;

	
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			Product productInfo = entityManager.getReference(Product.class, 105);
//			Product productInfo = entityManager.find(Product.class, 104);
//			System.out.println(productInfo.getClass());
			
			
			  System.out.println(productInfo.getPid());
			  System.out.println(productInfo.getPname());
			  System.out.println(productInfo.getQuantity());
			 
			
			entityManager.close();
			
		
	}
}
