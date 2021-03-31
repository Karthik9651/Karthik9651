package com.cg.onlineeyecare.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.onlineeyecare.dto.test;
import com.cg.onlineeyecare.exceptions.TestIdNotFoundException;

/************************************************************************************
 *          @author          G.Karthik Kumar Reddy
 *          Description      It is a test service interface that describes the abstract methods
 *                           used in its implementation class.
  *         Version             1.0
  *         Created Date     22-MARCH-2021
 ************************************************************************************/
@Service
public interface ITestService {
	test addTest(test test);

	test updateTest(test test);

	test removeTest(int testId) throws TestIdNotFoundException;

	test viewTest(int testId)throws TestIdNotFoundException;

	List<test> viewAllTests();
}
