package com.example.demo.exception;

@SuppressWarnings("serial")
public class NoDataFoundException extends RuntimeException {
	
	public NoDataFoundException() {

        super("No data found");
    }
}
