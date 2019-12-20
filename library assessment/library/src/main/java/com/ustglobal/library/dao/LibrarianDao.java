package com.ustglobal.library.dao;

import java.util.List;

import com.ustglobal.library.dto.Librarian;


public interface LibrarianDao {

		public boolean addStudent(Librarian bean);
		public boolean modifyStudent(Librarian bean);
		public boolean deleteStudent(int student_id);
		public List<Librarian> getStudent(Librarian library);
		public List<Librarian> getAllStudent();
	
		
		
		
		
}
