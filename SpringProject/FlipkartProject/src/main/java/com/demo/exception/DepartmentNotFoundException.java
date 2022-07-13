package com.demo.exception;


/**
 * @author SaptakPatil
 *
 */

public class DepartmentNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	DepartmentNotFoundException(String exceptionMessage){
		super(String.format("The department you are trying to find is 'NOT FOUND'.", exceptionMessage));
	}
	
}
