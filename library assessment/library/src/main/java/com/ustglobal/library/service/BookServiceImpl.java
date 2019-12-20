package com.ustglobal.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.library.dao.BookDao;
import com.ustglobal.library.dto.Book;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao dao;
	
	@Override
	public boolean addBook(Book bean) {
		return dao.addBook(bean);
	}

	@Override
	public boolean modifyBook(Book bean) {
		return dao.modifyBook(bean);
	}

	@Override
	public boolean deleteBook(int book_id) {
		return dao.deleteBook(book_id);
	}

	@Override
	public Book getBook(int book_id) {
		return dao.getBook(book_id);
	}

	@Override
	public List<Book> getAllBook() {
		return dao.getAllBook();
	}

}
