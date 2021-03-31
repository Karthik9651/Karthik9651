package com.cg.onlineeyecare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineeyecare.dto.test;
import com.cg.onlineeyecare.exceptions.TestIdNotFoundException;
import com.cg.onlineeyecare.service.ITestService;

import io.swagger.annotations.Api;
/************************************************************************************
 *          @author          G.Karthik Kumar Reddy
 *          Description      It is a controller class that controls the data flow into model object 
 *                           and updates the view whenever data changes
  *         Version          1.0
  *         Created Date     22-MARCH-2021
 ************************************************************************************/

@Api(value="Swagger2Demo")
@RestController
@RequestMapping("/v1")
public class ITestController {
	
	@Autowired
	public ITestService tservice;
	/************************************************************************************
	 * Method:                          viewAllTests
     *Description:                      To display all the tests
	 * @returns List<test>            - It returs all the tests present in database
	 * @GetMapping:                     It is used to handle GET type of request method.
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
     @GetMapping("/alltests")
     public List<test> viewAllTests(){
    	 return tservice.viewAllTests();
     }
     /************************************************************************************
 	 * Method:                          addTest
     *Description:                      It is used to add Test into test table
     * @param test:                     test's reference variable.
 	 * @returns test                    It returns test with details
 	 * @PostMapping:                    It  is used to handle POST type of request method
 	 * @RequestBody:                    It maps the HttpRequest body to a transfer or domain object
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
 	 
 	 ************************************************************************************/
     @PostMapping("/test/add")
     public test add(@RequestBody test test)  {
		return tservice.addTest(test);
     }

 	/************************************************************************************
 	 * Method:                           removeTest
      *Description:                      It is used to remove test
      *@param test:                      test's reference variable.
 	 * @returns test                     It returns the test that has been deleted
 	 * @throws TestIdNotFoundException:  It is raised due to invalid test.
 	 * @DeleteMapping:                   It  is used to handle DELETE type of request method.
 	 * @RequestBody:                     It maps the HttpRequest body to a transfer or domain object
     *Created By                       - G.Karthik Kumar Reddy
     *Created Date                     - 22-MARCH-2021                           
 	 
 	 ************************************************************************************/
    @DeleteMapping("/test/remove/{testId}")
    public test removeTest(@PathVariable int testId) throws TestIdNotFoundException  {
		return tservice.removeTest(testId);
    }
    /************************************************************************************
	 * Method:                          updateTest
     *Description:                      It is used to update test details into test table.
     * @param test:                     Test's reference variable.
	 * @returns test                    It returns updated details of the existed test.
	 * @PuttMapping:                    It  is used to handle PUT type of request method
	 * @RequestBody:                    It maps the HttpRequest body to a transfer or domain object
     *Created By                    -   G.Karthik Kumar Reddy
     *Created Date                  -   22-MARCH-2021                           
	 
	 ************************************************************************************/
    @PutMapping
    public test updateTest(@RequestBody test test) {
    	return tservice.updateTest(test);
    }
    /************************************************************************************
	 * Method:                          viewTest
     *Description:                      To display the test by Id (Primary key)
     *@param testid:                        id of the test.
	 * @returns test                  - if test with Id presents it returns test else throws TestIdNotFoundException
	 * @throws TestIdNotFoundException  - It is raised due to invalid  testId 
	 * @GetMapping:                     It is used to is used to handle GET type of request method.
	 * @PathVariable:                   It  is used for data passed in the URI and transfer its values to parameter variables.
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
    
    @GetMapping("/test/viewtest/{testid}")  
    private test viewTest(@PathVariable("testid") int testid) throws TestIdNotFoundException   
    {  
    return tservice.viewTest(testid);
    }
}
