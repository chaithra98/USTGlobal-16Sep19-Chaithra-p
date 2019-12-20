package com.ustglobal.library.dao;

import java.util.List;

import com.ustglobal.library.dto.UserBean;


public interface UserDao {

	public boolean addUser(UserBean Bean);
	public boolean modifyUser(UserBean Bean);
	public boolean deleteUser(int id);
	public List<UserBean> getAllUser();
	 public List<UserBean> getUser(UserBean bean);
	 public UserBean login(String email, String password,String role);
}
