package com.ustglobal.library.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.library.dto.Book;
import com.ustglobal.library.dto.Librarian;

@Repository
public class BookDaoImpl implements BookDao {
	
	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addBook(Book bean) {
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
	public boolean modifyBook(Book bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Book book=manager.find(Book.class,bean.getBook_id());
		book.setBook_id(bean.getBook_id());
		book.setBook_name(bean.getBook_name());
		book.setAuthor_name(bean.getAuthor_name());
		book.setIssue_date(bean.getIssue_date());
		book.setEnd_date(bean.getEnd_date());
		transaction.commit();
		return true;
		}
	@Override
	public boolean deleteBook(int book_id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Book bean=manager.find(Book.class,book_id);
		if(bean!=null) {
		manager.remove(bean);
		transaction.commit();
		return true;
		}else {
			return false;
		}
	}

	@Override
	public Book getBook(int book_id) {
		EntityManager manager=factory.createEntityManager();
		Book bean=manager.find(Book.class, book_id);
		return bean;
	}

	@Override
	public List<Book> getAllBook(){
	EntityManager manager=factory.createEntityManager();
	String jpql="from Book";
	TypedQuery<Book> query=manager.createQuery(jpql, Book.class);
	List<Book> book=query.getResultList();
		return book;
	}
	@Override
	public int trackBook(Date issue_date, Date end_date) {
		
		return 0;
	}


}
