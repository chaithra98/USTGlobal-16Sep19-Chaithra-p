package com.ustglobal.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.library.dto.Librarian;

@Repository
public class LibrarianDaoImpl implements LibrarianDao{

	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public boolean addStudent(Librarian bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		}
	

	@Override
	public boolean modifyStudent(Librarian bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Librarian library=manager.find(Librarian.class,bean.getStudent_id());
		library.setFname(bean.getFname());
		library.setLname(bean.getLname());
		library.setGender(bean.getGender());
		library.setEmail(bean.getEmail());
		library.setPhoneno(bean.getPhoneno());
		transaction.commit();
		return true;
		}
	

	@Override
	public boolean deleteStudent(int student_id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Librarian bean=manager.find(Librarian.class, student_id);
		manager.remove(bean);
		transaction.commit();
		return true;
	}

	@Override
	public List<Librarian> getStudent(Librarian library) {
		EntityManager manager=factory.createEntityManager();
		TypedQuery<Librarian> query=manager.createQuery("from Student where student_id=:student_id", Librarian.class);
		query.setParameter("student_id", library.getStudent_id());
		List<Librarian> list=query.getResultList();
		return list;
	}

	@Override
	public List<Librarian> getAllStudent(){
	EntityManager manager=factory.createEntityManager();
	String jpql="from Librarian";
	TypedQuery<Librarian> query=manager.createQuery(jpql, Librarian.class);
	List<Librarian> librarians=query.getResultList();
		return librarians;
	}
	

	

}
