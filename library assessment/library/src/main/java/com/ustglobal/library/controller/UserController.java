package com.ustglobal.library.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.library.dto.UserBean;
import com.ustglobal.library.dto.UserResponse;
import com.ustglobal.library.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping(path="/add",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public  UserResponse addUser(@RequestBody UserBean bean) {	
		UserResponse response=new UserResponse();
		if(service.addUser(bean)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("Data added to the db");
			response.setUserbean(Arrays.asList(bean));
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("Data not added to the db");	
		}
		return response;
	}

	@PostMapping(path="/login/{email}/{password}/{role}",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse login(@PathVariable("email")String email,@PathVariable("password") String password,
			@PathVariable("role") String role,HttpServletRequest request) {
		UserResponse response=new UserResponse();
		UserBean bean=service.login(email, password, role);
		if(bean!= null) {
			HttpSession session=request.getSession();
			session.setAttribute("UserBean", bean);
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("login successfull");
			response.setUserbean(Arrays.asList(bean));
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("Data not added to the db");	
		}
		return response;
	}

	@PutMapping(path="/modify",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse modifyStudent(@RequestBody UserBean bean) {
		UserResponse response=new UserResponse();
		if(service.modifyUser(bean)) {
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

	@DeleteMapping(path="delete/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse deleteStudent(@PathVariable("student_id")int student_id)
	{
		UserResponse response=new UserResponse();
		if(service.deleteUser(student_id)) {
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

	@GetMapping(path="/get/{id}" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<UserBean> allstudentByID(@PathVariable("id") int id,UserBean bean) {
		bean.setId(id);
		return service.getUser(bean);

	}

	@GetMapping(path="/get-all",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<UserBean> getAllUsers() {
		return service.getAllUser();
	}

}



