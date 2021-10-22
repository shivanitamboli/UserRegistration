package com.bridgelab;

public class UserRegistrationException extends RuntimeException {
	public enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY
	}

	public ExceptionType type;

	public UserRegistrationException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
