package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReAttaching {

	public static void main(String[] args) {

		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Product productInfo = entityManager.find(Product.class, 102);
			System.out.println(entityManager.contains(productInfo));
			entityManager.detach(productInfo);
			System.out.println(entityManager.contains(productInfo));
			Product productInfo2 = entityManager.merge(productInfo);
			productInfo2.setPname("Mobile");
			productInfo2.setQuantity(50);
			System.out.println("record updated");
			
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}	//End of main()
}	// End of ReAttaching class
