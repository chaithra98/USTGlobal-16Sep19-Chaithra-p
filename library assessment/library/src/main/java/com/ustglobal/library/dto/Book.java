package com.ustglobal.library.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="book")
public class Book {
	@Id
	@Column
	@GeneratedValue
	private int book_id;
	@Column
	private int sid;
	@Column
	private String book_name;
	@Column
	private String author_name;
	@Column
	private String publisher_name;
	@Column
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date issue_date;
	@Column
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date end_date;
	/*@Exclude
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="book")
	private List<Student> Student;*/


}
