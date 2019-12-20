package com.ustglobal.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.library.dao.UserDao;
import com.ustglobal.library.dto.UserBean;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao; 

	@Override
	public UserBean login(String email, String password,String role) {
		return dao.login(email, password,role);
	}

	@Override
	public boolean addUser(UserBean Bean) {
		return dao.addUser(Bean);
	}

	@Override
	public boolean modifyUser(UserBean Bean) {
		return dao.modifyUser(Bean);
	}

	@Override
	public boolean deleteUser(int id) {
		return dao.deleteUser(id);
	}

	@Override
	public List<UserBean> getAllUser() {
		return dao.getAllUser();
	}

	@Override
	public List<UserBean> getUser(UserBean bean) {
		return dao.getAllUser();
	}

}
