package com.ustglobal.library.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.library.dto.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean login(int library_id, String password) {
		String jpql="from Student where library_id=:library_id and password=:password";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<Student> query=manager.createQuery(jpql,Student.class);
		query.setParameter("library_id", library_id);
		query.setParameter("password", password);
		try {
			Student bean=query.getSingleResult();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean requestBook(int book_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Register(Student bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
