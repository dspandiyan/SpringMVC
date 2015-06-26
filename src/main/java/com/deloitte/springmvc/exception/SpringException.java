package com.deloitte.springmvc.exception;

public class SpringException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String exceptionMessage;
	
	public SpringException(String exceptionMessage){
		this.exceptionMessage = exceptionMessage;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
}