package com.ustglobal.emailapp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data
@Entity
@Table(name="Mail_Info")
public class Mail_Info {
	@Id
	@Column

	private int mid;
	@Column
	private int from_id;
	@Column
	private int to_id;
	@Column
	private String subject;
	@Column
	private String message;
	@Column
	private String status;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id", nullable = false)
	private User_Info user_info;

}
