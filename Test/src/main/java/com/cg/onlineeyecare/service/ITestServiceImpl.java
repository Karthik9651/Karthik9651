package com.cg.onlineeyecare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineeyecare.dao.ITestRepository;
import com.cg.onlineeyecare.dto.test;
import com.cg.onlineeyecare.exceptions.TestIdNotFoundException;

/************************************************************************************
 *          @author          G.Karthik Kumar Reddy
 *          Description      It is a test service implementation class that defines the methods
 *                           mentioned in its interface.
  *         Version             1.0
  *         Created Date     22-MARCH-2021
 ************************************************************************************/
@Service
public class ITestServiceImpl implements ITestService {
	@Autowired
	private ITestRepository repository;
	/************************************************************************************
	 * Method:                          addTest
     *Description:                      It is used to add test into test table
     * @param test:                     Test's reference variable.
	 * @returns test                    It returns test with details
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
	@Override
	public test addTest(test test) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(test);
	}
	/************************************************************************************
	 * Method:                          updateTest
     *Description:                      It is used to update test details into test table.
     * @param test:                     test's reference variable.
	 * @returns test                    It returns updated details of the existed test.
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
	@Override
	public test updateTest(test test) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(test);
	}
	/************************************************************************************
	 * Method:                          removeTest
     *Description:                      It is used to remove test
     *@param test:                      test's reference variable.
	 * @returns test                    It returns the test that has been deleted
	 * @throws TestIdNotFoundException: It is raised due to invalid test.
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
	@Override
	public test removeTest(int testId) throws TestIdNotFoundException {
		// TODO Auto-generated method stub
		Optional<test> test = repository.findById(testId);
		if (test.isPresent()) {
			repository.deleteById(testId);
			return test.get();
		} else {
			throw new TestIdNotFoundException("Please Enter the id which is available");
		}
	}
	/************************************************************************************
	 * Method:                          viewTest
     *Description:                      To display the test by Id (Primary key)
     *@param id:                        id of the test.
	 * @returns test                  - if test with Id presents it returns test else throws TestIdNotFoundException
	 * @throws TestIdNotFoundException  -  It is raised due to invalid  TestId 
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
	@Override
	public test viewTest(int testId) throws TestIdNotFoundException {
		Optional<test> test = repository.findById(testId);
		if (test.isPresent()) {
			return test.get();
		} else {
			throw new TestIdNotFoundException("Please Enter id which is available");
		}
	}
	/************************************************************************************
	 * Method:                          viewAllTests
     *Description:                      To display all the tests
	 * @returns List<test>            - It returs all the tests present in database
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                     - 22-MARCH-2021                           
	 
	 ************************************************************************************/
	@Override
	public List<test> viewAllTests() {

		return repository.findAll();
	}

}
