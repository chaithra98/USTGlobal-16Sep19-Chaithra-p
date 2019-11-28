package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetomany.Pencil;
import com.ustglobal.jpawithhibernateapp.onetomany.PencilBox;

public class TestOneToMany {

	public static void main(String[] args) {

		PencilBox pb = new PencilBox();
		pb.setBid(30);
		pb.setBname("HB");

		Pencil p = new Pencil();
		p.setPid(13);
		p.setColor("black");
		p.setPencilBox(pb);

		Pencil p1 = new Pencil();
		p1.setPid(14);
		p1.setColor("Red");
		p1.setPencilBox(pb);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			PencilBox b = entityManager.find(PencilBox.class, 10);
			System.out.println(b.getPencil());
			
			entityManager.persist(p);
			entityManager.persist(p1);
			System.out.println("Record saved");
			entityTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		} finally {
			entityManager.close();
		}
	}
}
