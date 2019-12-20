package com.ustglobal.library.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.library.dto.Librarian;
import com.ustglobal.library.dto.LibrarianResponse;
import com.ustglobal.library.service.LibrarianService;

@RestController
@RequestMapping("/librarian")
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")

public class LibrarianController {

	@Autowired
	private LibrarianService service;

	@PostMapping(path="/add",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public  LibrarianResponse addStudent(@RequestBody Librarian bean) {	LibrarianResponse response=new LibrarianResponse();
	if(service.addStudent(bean)) {
		response.setStatuscode(201);
		response.setMessage("success");
		response.setDescription("Data added to the db");
	}else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("Data not added to the db");	
	}
	return response;
	}
	
	@PutMapping(path="/modify/{student_id}",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public LibrarianResponse modifyStudent(@RequestBody Librarian bean, @PathVariable("student_id") int student_id) {
		LibrarianResponse response=new LibrarianResponse();
		if(service.modifyStudent(bean)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("data modified in the db");
			response.setLibrarian(Arrays.asList(bean));
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("data not modified in the db");	
		}
		return response;
	}
	
	@DeleteMapping(path="delete/{student_id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public LibrarianResponse deleteStudent(@PathVariable("student_id")int student_id)
	{
		LibrarianResponse response=new LibrarianResponse();
		if(service.deleteStudent(student_id)) {
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
	
	@GetMapping(path="/get/{student_id}" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Librarian> allstudentByID(@PathVariable("student_id") int student_id,Librarian library) {
		library.setStudent_id(student_id);
		return service.getStudent(library);

	}
	
	@GetMapping(path="/get-all",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Librarian> getAllstudents() {
		return service.getAllStudent();
	}

	@GetMapping(path="/exce" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public void createException() {
		int i=1/0;
	}
}
