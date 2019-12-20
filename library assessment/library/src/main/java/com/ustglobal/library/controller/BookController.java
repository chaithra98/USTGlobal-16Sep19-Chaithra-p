package com.ustglobal.library.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.library.dto.Book;
import com.ustglobal.library.dto.BookResponse;
import com.ustglobal.library.service.BookService;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
@RequestMapping("/book")
public class BookController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@Autowired	
	private BookService service;

	@PostMapping(path="/add1",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public  BookResponse addBook(@RequestBody Book bean)
	{	BookResponse response=new BookResponse();
	if(service.addBook(bean)) {
		response.setStatuscode(201);
		response.setMessage("success");
		response.setDescription("Data added to the db");
		response.setBook(Arrays.asList(bean));
	}else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("Data not added to the db");	
	}
	return response;
	}
	@PutMapping(path="/modify",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public BookResponse modifyBook(@RequestBody Book bean) {
		BookResponse response=new BookResponse();
		if(service.modifyBook(bean)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("data modified in the db");
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("data not modified in the db");

		}
		return response;

	}
	@DeleteMapping(path="/delete/{book_id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public BookResponse deleteBook(@PathVariable("book_id")int book_id)
	{
		BookResponse response=new BookResponse();
		if(service.deleteBook(book_id)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("data deleted in the db");
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("data not deleted in the db");	
		}
		return response;
	}
	@GetMapping(path="/get/{book_id}" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public BookResponse getStudent(@PathVariable("book_id")int book_id) {

		BookResponse response=new BookResponse();
		Book bean=service.getBook(book_id);
		if(bean!=null) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("data found in the db");
			response.setBook(Arrays.asList(bean));
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("data not found in the db");	
		}
		return response;
	}

	@GetMapping(path="/get-all",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getAllBooks() {
		return service.getAllBook();
	}

	@GetMapping(path="/exce" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public void createException() {
		int i=1/0;

	}
}


