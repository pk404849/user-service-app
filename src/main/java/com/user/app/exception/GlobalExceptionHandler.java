package com.user.app.exception;

import java.sql.Timestamp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserException.class)
	public ResponseEntity<?> hanldeUserException(UserException userException) {
		ErrorResponse response = new ErrorResponse();
		response.setMessage(userException.getMessage());
		response.setDateTime(new Timestamp(System.currentTimeMillis()));
		response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		System.out.println("User Exception : "+response);
		return ResponseEntity.ok(response);

	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleGobalException(Exception exception) {
		
		ErrorResponse response = new ErrorResponse();
		response.setMessage(exception.getMessage());
		response.setDateTime(new Timestamp(System.currentTimeMillis()));
		response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		System.out.println("handleGobalException : "+exception);
		return ResponseEntity.ok(response);
	}

}
