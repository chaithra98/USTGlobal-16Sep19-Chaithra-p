package com.ustglobal.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.library.dao.StudentDao;
import com.ustglobal.library.dto.Student;

@Service
public class StudentServiceImpl implements StudentService  {
	
	@Autowired
	private StudentDao dao;
	
	@Override
	public boolean login(int library_id, String password) {
		return dao.login(library_id, password);
	}

	@Override
	public boolean requestBook(int book_id) {
		return dao.requestBook(book_id);
	}

	@Override
	public boolean Register(Student bean){
		return dao.Register(bean);
	}
}
