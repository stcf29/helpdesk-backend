package com.sergio.helpdesk.services.exceptions;

public class ObjectnotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public s(String message, Throwable cause) {
		super(message,cause);
		
	}

	public ObjectnotFoundException(String message) {
		super(message);
		
	}
	
	
}
