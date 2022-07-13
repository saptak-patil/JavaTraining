package com.demo.exception;

public class ProductNotfoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	ProductNotfoundException(String exceptionmessage){
		
		super(String.format(" your product not found"+exceptionmessage));
	}	

}
