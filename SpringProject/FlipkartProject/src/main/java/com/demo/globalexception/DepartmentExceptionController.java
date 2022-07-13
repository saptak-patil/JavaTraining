package com.demo.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.demo.exception.DepartmentNotFoundException;

/**
 * @author SaptakPatil
 *
 */
@ControllerAdvice
public class DepartmentExceptionController extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = DepartmentNotFoundException.class)
	public ResponseEntity<Object> exception(DepartmentNotFoundException exception) {
		return new ResponseEntity<>("Department Not Found", HttpStatus.NOT_FOUND);
	}

}
