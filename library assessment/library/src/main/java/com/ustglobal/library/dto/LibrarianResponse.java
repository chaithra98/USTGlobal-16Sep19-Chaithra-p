package com.ustglobal.library.dto;

import java.util.List;


public class LibrarianResponse {
	
	private int statuscode;
	private String message;
	private String description;
	private List<Librarian> Librarian;


	public List<Librarian> getLibrarian() {
		return Librarian;
	}
	public void setLibrarian(List<Librarian> librarian) {
		Librarian = librarian;
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
