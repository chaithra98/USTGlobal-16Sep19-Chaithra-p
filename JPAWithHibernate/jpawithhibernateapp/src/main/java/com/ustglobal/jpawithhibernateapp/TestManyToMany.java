package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;

public class TestManyToMany {

	public static void main(String[] args) {


		Course c1 = new Course();
		c1.setCid(30);
		c1.setCname("Java");

		Course c2 = new Course();
		c2.setCid(40);
		c2.setCname("Python");

		Course c3 = new Course();
		c3.setCid(50);
		c3.setCname("Hibernate");
		
		ArrayList<Course> alCourses = new ArrayList<Course>();
		alCourses.add(c1);
		alCourses.add(c2);
		alCourses.add(c3);
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setSname("Chaithra");
		s1.setCourse(alCourses);
		
		Student s2 = new Student();
		s2.setId(2);
		s2.setSname("Akshatha");
		s2.setCourse(alCourses);
		
		Student s3 = new Student();
		s3.setId(3);
		s3.setSname("Pooja");
		s3.setCourse(alCourses);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			System.out.println("Records saved sucessfully");
			entityManager.persist(s1);
			entityManager.persist(s2);
			entityManager.persist(s3);
			
			entityTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		} finally {
			entityManager.close();
		}

	}
}