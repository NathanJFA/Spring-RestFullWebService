package com.appsdeveloperblog.app.ws.ui.model.response;

import java.util.Calendar;

public class ErrorMessage {
	
	private Calendar timestamp;
	private String message;
	
	public ErrorMessage() {}
	
	public ErrorMessage(Calendar timestamp, String message) {
		this.timestamp = timestamp;
		this.message = message;
	}
	public Calendar getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Calendar timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
