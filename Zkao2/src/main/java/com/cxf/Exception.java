package com.cxf;

public class Exception extends RuntimeException{
	
	//2.在工具包工程中编写自定义运行时异常类
	private static final long serialVersionUID = 1L;

	public Exception() {
		super();
	}

	public Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public Exception(String message, Throwable cause) {
		super(message, cause);
	}

	public Exception(String message) {
		super(message);
	}

	public Exception(Throwable cause) {
		super(cause);
	}
	
	
	

}
