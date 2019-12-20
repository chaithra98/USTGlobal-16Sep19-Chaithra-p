package com.ustglobal.library.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.library.dto.LibrarianResponse;

@RestControllerAdvice
public class HandleException {

	@ExceptionHandler(Exception.class)
	
	public LibrarianResponse getException() {
		LibrarianResponse response=new LibrarianResponse();
		response.setStatuscode(501);
		response.setMessage("Error in code");
		response.setDescription("got an exception");
		return response;

	}

}