package com.user.app.exception;

public class UserException extends Exception {

	private static final long serialVersionUID = -5673684841407489487L;

	private String message;

	public UserException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
