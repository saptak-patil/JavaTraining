package com.demo.exception;


/**
 * @author SaptakPatil
 *
 */

public class ProductNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	ProductNotFoundException(String exceptionMessage){
		super(String.format("The product you are trying to find is Not found.", exceptionMessage));
	}
	
}
