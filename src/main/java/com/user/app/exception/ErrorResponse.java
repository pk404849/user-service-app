package com.user.app.exception;

import java.sql.Timestamp;

public class ErrorResponse {

	private String message;
	private int status;
	private Timestamp dateTime;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Timestamp getDateTime() {
		return dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "ErrorResponse [message=" + message + ", status=" + status + ", dateTime=" + dateTime + "]";
	}

}
