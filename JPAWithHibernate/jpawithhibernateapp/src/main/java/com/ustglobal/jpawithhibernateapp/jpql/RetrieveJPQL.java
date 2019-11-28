package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class RetrieveJPQL {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from Product";
		Query query = entityManager.createQuery(jpql);
		List<Product> li = query.getResultList();
		for(Product p : li) {
			System.out.println("==================");
			System.out.println(p.getPid());
			System.out.println(p.getPname());
			System.out.println(p.getQuantity());
			
		}
		entityManager.close();

	}	//End of the main()
}	//End of class
