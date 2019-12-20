package com.ustglobal.library.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name="librarian")
public class Librarian {
	@Id
	@Column
	@GeneratedValue
	private int student_id;
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private String gender;
	@Column
	private String email;
	@Column
	private long phoneno;
	/*@OneToMany(mappedBy="librarian")
	private List<Student> student;
	 */
}
