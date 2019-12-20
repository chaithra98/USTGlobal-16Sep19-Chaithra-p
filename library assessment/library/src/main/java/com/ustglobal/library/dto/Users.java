package com.ustglobal.library.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="user")
@Data
public class Users {

	@Id
	@GeneratedValue
	@Column
	private int user_id;
	@Column
	private String user_email;
	@Column
	private String user_password;
	@Column
	private String role;
}
