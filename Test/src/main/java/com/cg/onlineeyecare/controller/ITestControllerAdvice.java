package com.cg.onlineeyecare.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.onlineeyecare.exceptions.TestIdNotFoundException;
/************************************************************************************
 *          @author          G.Karthik Kumar Reddy
 *          Description      It is a controller advice class that handles the exception occurs at 
 *                           TestIdNotFoundException class
  *         Version          1.0
  *         Created Date     22-MARCH-2021
 ************************************************************************************/
@RestControllerAdvice
public class ITestControllerAdvice {
	/************************************************************************************
	 * Method:                          ITestException
     *Description:                      It is used to return the exception message and its HTTP status
	 * @returns Response entity         It returns the exception message and its HTTP status.
	 * @param exception                 It is parent class of exception
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
@ExceptionHandler(TestIdNotFoundException.class)
public ResponseEntity<String>  ITestException(Exception e) {
	return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
}
}
