package com.kardam.testproject.exception;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public CustomException() {
		super();
	}

	public CustomException(String s) {
		super(s);
	}

	public HttpStatus getStatus() {
		return HttpStatus.INTERNAL_SERVER_ERROR;
	}
}
