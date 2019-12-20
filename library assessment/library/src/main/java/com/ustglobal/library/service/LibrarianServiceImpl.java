package com.ustglobal.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.library.dao.LibrarianDao;
import com.ustglobal.library.dto.Librarian;

@Service
public class LibrarianServiceImpl implements LibrarianService{
	@Autowired
	private LibrarianDao dao;

	@Override
	public boolean addStudent(Librarian bean) {
		return dao.addStudent(bean);
	}

	@Override
	public boolean modifyStudent(Librarian bean) {
		return dao.modifyStudent(bean);
	}

	@Override
	public boolean deleteStudent(int student_id) {
		return dao.deleteStudent(student_id);
	}

	@Override
	public List<Librarian> getAllStudent() {
		return dao.getAllStudent();
	}

	@Override
	public List<Librarian> getStudent(Librarian library) {
		return dao.getStudent(library);
	}

}
