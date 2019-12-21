package com.ustglobal.emailapp.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="User_Info")
public class User_Info {
	@Id
	@Column
	@GeneratedValue

	private int id;
	@Column
	private String name;
	@Column(unique=true)
	private String email;
	@Column
	private String password;
	@JsonIgnore
	@Exclude
	@OneToMany(mappedBy = "user_info")	
	private List<Mail_Info> mail_info;

}
