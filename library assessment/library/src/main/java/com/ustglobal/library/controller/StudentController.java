package com.ustglobal.library.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.library.dto.Student;
import com.ustglobal.library.dto.StudentResponse;
import com.ustglobal.library.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping(path="/login",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public StudentResponse login(@RequestBody int library_id,String password) {
		StudentResponse response=new StudentResponse();
		if(service.login(library_id, password)) {
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
	
	@PutMapping(path="/add2",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public  StudentResponse addStudent(@RequestBody Student bean)
	{	StudentResponse response=new StudentResponse();
	if(service.Register(bean)) {
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

}
