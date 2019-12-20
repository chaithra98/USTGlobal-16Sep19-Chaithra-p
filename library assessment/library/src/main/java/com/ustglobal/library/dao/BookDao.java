package com.ustglobal.library.dao;

import java.util.Date;
import java.util.List;

import com.ustglobal.library.dto.Book;

public interface BookDao {

	public boolean addBook(Book bean);
	public boolean modifyBook(Book bean);
	public boolean deleteBook(int book_id);
	public Book getBook(int book_id);
	public List<Book> getAllBook();
	public int trackBook(Date issue_date,Date end_date);
}
