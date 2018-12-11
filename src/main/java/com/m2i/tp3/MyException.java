package com.m2i.tp3;

/*
 * si MyException herite de RuntimeException , alors try/catch facultatif
 *    sinon try/catch obligatoire
 */

//public class MyException extends RuntimeException {
public class MyException extends Exception {

	public MyException() {
	}

	public MyException(String message) {
		super(message);
	}

	public MyException(Throwable cause) {
		super(cause);
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
