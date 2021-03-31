package com.cg.onlineeyecare.exceptions;

/************************************************************************************
 *          @author          G.Karthik Kumar Reddy
 *          Description      It is a exception class that handles the exception occurs at 
 *                           service level
  *         Version             1.0
  *         Created Date    22-MARCH-2021
 ************************************************************************************/
public class TestIdNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestIdNotFoundException(String message) {
		
		super(message);
	}
	
}
