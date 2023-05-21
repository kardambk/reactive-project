package com.kardam.testproject.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends CustomException {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public NotFoundException() {
		super();
	}

	public NotFoundException(String message) {
        super(message);
    }

	@Override
	public HttpStatus getStatus() {
		return HttpStatus.NOT_FOUND;
	}

}
