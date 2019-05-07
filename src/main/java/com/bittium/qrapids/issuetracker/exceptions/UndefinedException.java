package com.bittium.qrapids.issuetracker.exceptions;

public class UndefinedException extends Exception{
	
	public UndefinedException(String message) {
		super(message);
	}
    public UndefinedException(String message, Throwable cause) {
        super(message, cause);
    }
}