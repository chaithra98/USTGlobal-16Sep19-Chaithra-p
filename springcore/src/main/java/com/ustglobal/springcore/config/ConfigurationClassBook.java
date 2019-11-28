package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;

//import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class ConfigurationClassBook {

	@Bean(name="book")
	public Book getBook() {
		Book b = new Book();
		b.setAuthor("Pooja");
		b.setName("SpringCore");
		b.setPrice(150);
		return b;
	}
	
	/*public Author getAuthor() {
		Author a = new Author();
		a.setName(name);
		return ;
	}*/
	
}
