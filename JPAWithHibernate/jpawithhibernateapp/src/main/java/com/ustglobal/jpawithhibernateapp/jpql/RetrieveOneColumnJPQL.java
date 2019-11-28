package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class RetrieveOneColumnJPQL {
	public static void main(String[] args) {


		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = " select pname from Product";
		Query query = entityManager.createQuery(jpql);

		List<String> li = query.getResultList();

		for(String p : li) {
			System.out.println(p);
			System.out.println("==================");

			/*System.out.println(p.getPid());
		System.out.println(p.getPname());
		System.out.println(p.getQuantity());
			 */
		}
		entityManager.close();

	}
}