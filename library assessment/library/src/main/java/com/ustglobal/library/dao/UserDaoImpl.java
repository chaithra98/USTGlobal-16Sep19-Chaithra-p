package com.ustglobal.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.library.dto.Librarian;
import com.ustglobal.library.dto.UserBean;

@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public UserBean login(String email,String password,String role) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		String jpql="from UserBean where email=:email and password=:password and role=:role";
		TypedQuery<UserBean> query=manager.createQuery(jpql,UserBean.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		query.setParameter("role", role);
		try {
			UserBean bean=query.getSingleResult();
			return bean;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

	@Override
	public boolean addUser(UserBean bean) {
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
	public boolean deleteUser(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		UserBean bean=manager.find(UserBean.class, id);
		manager.remove(bean);
		transaction.commit();
		return true;
	}
	

	@Override
	public List<UserBean> getUser(UserBean bean) {
		
			EntityManager manager=factory.createEntityManager();
			TypedQuery<UserBean> query=manager.createQuery("from Student where id=:id", UserBean.class);
			query.setParameter("id", bean.getId());
			List<UserBean> list=query.getResultList();
			return list;
		}
	

	@Override
	public boolean modifyUser(UserBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		UserBean bean1=manager.find(UserBean.class, bean.getId());
		bean1.setEmail(bean.getEmail());
		bean1.setPassword(bean.getPassword());
		bean1.setRole(bean.getRole());
		transaction.commit();
		return true;
	}


	@Override
	public List<UserBean> getAllUser() {
		EntityManager manager=factory.createEntityManager();
		String jpql="from UserBean";
		TypedQuery<UserBean> query=manager.createQuery(jpql, UserBean.class);
		List<UserBean> bean=query.getResultList();
			return bean;
		}

	}


	

