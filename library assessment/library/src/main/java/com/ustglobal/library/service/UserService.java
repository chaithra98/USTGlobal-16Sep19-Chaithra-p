package com.ustglobal.library.service;

import java.util.List;

import com.ustglobal.library.dto.UserBean;

public interface UserService {

	public UserBean login(String email, String password,String role);
	public boolean addUser(UserBean Bean);
	public boolean modifyUser(UserBean Bean);
	public boolean deleteUser(int id);
	public List<UserBean> getUser(UserBean bean);
	public List<UserBean> getAllUser();
}
