package com.ustglobal.library.dto;

import java.util.List;

public class UserResponse {
	
	private int statuscode;
	private String message;
	private String description;
	private List<UserBean> userbean;

	public List<UserBean> getUserbean() {
		return userbean;
	}
	public void setUserbean(List<UserBean> userbean) {
		this.userbean = userbean;
	}
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
