package com.ustglobal.library.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="bookissue")
public class IssueBook {

	@Id
	@Column
	private int id;
	@Column
	private Date issue_date;
	@Column
	private Date end_date;
}
