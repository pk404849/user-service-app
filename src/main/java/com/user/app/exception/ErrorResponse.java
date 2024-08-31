package com.user.app.exception;

import java.sql.Timestamp;

public class ErrorResponse {

	private String message;
	private Integer statusCode;
	private Timestamp dateTime;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public Timestamp getDateTime() {
		return dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "ErrorResponse [message=" + message + ", status=" + statusCode + ", dateTime=" + dateTime + "]";
	}

}
