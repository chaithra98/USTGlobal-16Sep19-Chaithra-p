package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetoone.Person;
import com.ustglobal.jpawithhibernate.onetoone.VoterCard;

public class TestOneToOne {

	public static void main(String[] args) {

		VoterCard vc = new VoterCard();
		vc.setVid(20);
		vc.setVname("Bheem");

		Person p = new Person();
		p.setPid(2);
		p.setPname("Bheem");
		p.setVoterCard(vc);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			VoterCard vCard = entityManager.find(VoterCard.class, 10);
			System.out.println(vCard.getPerson().getPid());
		
			
			entityManager.persist(p); 
			System.out.println("Record saved");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
