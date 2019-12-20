package com.ustglobal.library.dao;

import com.ustglobal.library.dto.Student;

public interface StudentDao {

	public boolean login(int library_id,String password);
	public boolean requestBook(int book_id);
	public boolean Register(Student bean);
	
}

