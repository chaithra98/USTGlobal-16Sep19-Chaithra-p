package com.ustglobal.library.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Table(name="Student")
@Entity
public class Student {
	@GeneratedValue
	@Column
	@Id
	private int library_id;
	@Column
	private String student_name;
	@Column
	private int sem;
	@Column
	private String branch;
	@Column
	private String password;
	
}
