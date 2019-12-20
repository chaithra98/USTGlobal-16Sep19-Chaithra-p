package com.ustglobal.library.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="UserBean")
@Data
public class UserBean {

	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String role;
}
