package com.ustglobal.library.service;

import java.util.List;

import com.ustglobal.library.dto.Book;

public interface BookService {

	public boolean addBook(Book bean);
	public boolean modifyBook(Book bean);
	public boolean deleteBook(int book_id);
	public Book getBook(int book_id);
	public List<Book> getAllBook();
}
