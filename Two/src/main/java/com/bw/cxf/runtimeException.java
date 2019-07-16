package com.bw.cxf;

//定义异常类
public class runtimeException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public runtimeException() {
		super();
	}

	public runtimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public runtimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public runtimeException(String message) {
		super(message);
	}

	public runtimeException(Throwable cause) {
		super(cause);
	}
	
	

}
