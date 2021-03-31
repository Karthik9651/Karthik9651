package com.cg.onlineeyecare.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/************************************************************************************
 *@author          G.Karthik kumar Reddy
 *Description      It is a entity class that provides the details of the test  
 *Version             1.0
 *Created Date     22-MARCH-2021
 ************************************************************************************/
@Component
@Entity
public class test implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int testId;
	private String testName;
	private String testType;
	private String testDescription;;
	private double testCost;
	/************************************************************************************
	 * Method:                          test
     *Description:                      It is used to initialize the empty constructor.
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
	public test() {
		super();
	}
	/************************************************************************************
	 * Method:                          test
     *Description:                      It is used to initialize the parameterized constructor.
     *@param testId:                    test's Id. 
     *@param testName:                  test's Name. 
     *@param testType:                  test's Type. 
     *@param testDesciption:            test's Description. 
     *@param testCost:                  test's Cost. 
     *Created By                       - G.Karthik Kumar Reddy
     *Created Date                     - 22-MARCH-2021                           
	 
	 ************************************************************************************/
	public test(int testId, String testName, String testType, String testDescription, double testCost) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.testType = testType;
		this.testDescription = testDescription;
		this.testCost = testCost;
	}
	/************************************************************************************
	 * Method:                          getTestId
     *Description:                      It is used to get the test Id by getter method.
     *returns Integer:                  It returns test Id.
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
	public int getTestId() {
		return testId;
	}
	/************************************************************************************
	 * Method:                          setTestId
     *Description:                      It is used to set the test Id by setter method.
     * @param testId:                   test's Id. 
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
	public void setTestId(int testId) {
		this.testId = testId;
	}
	/************************************************************************************
	 * Method:                          getTestName
     *Description:                      It is used to get the test Name by getter method.
     *returns String:                   It returns test Name.
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
	public String getTestName() {
		return testName;
	}
	/************************************************************************************
	 * Method:                          setTestName
     *Description:                      It is used to set the test Name by setter method.
     * @param testName:                 test's Name. 
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
	public void setTestName(String testName) {
		this.testName = testName;
	}
	/************************************************************************************
	 * Method:                          getTestType
     *Description:                      It is used to get the test Type by getter method.
     *returns String:                   It returns test Type.
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
	public String getTestType() {
		return testType;
	}
	/************************************************************************************
	 * Method:                          setTestType
     *Description:                      It is used to set the test Type by setter method.
     * @param testType:                 test's Type. 
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
	public void setTestType(String testType) {
		this.testType = testType;
	}
	/************************************************************************************
	 * Method:                          getTestDescription
     *Description:                      It is used to get the test Description by getter method.
     *returns String:                   It returns test Description.
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
	
	public String getTestDescription() {
		return testDescription;
	}
	/************************************************************************************
	 * Method:                          setTestDescription
     *Description:                      It is used to set the test Description by setter method.
     *@param testDescription:          test's Description. 
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
	public void setTestDescription(String testDescription) {
		this.testDescription = testDescription;
	}
	/************************************************************************************
	 * Method:                          getTestCost
     *Description:                      It is used to get the test Cost by getter method.
     *returns Double:                   It returns test Cost.
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
	public double getTestCost() {
		return testCost;
	}
	/************************************************************************************
	 * Method:                          setTestCost
     *Description:                      It is used to set the test Cost by setter method.
     * @param testCost:                 test's Cost. 
     *Created By                      - G.Karthik Kumar Reddy
     *Created Date                    - 22-MARCH-2021                           
	 
	 ************************************************************************************/
	public void setTestCost(double testCost) {
		this.testCost = testCost;
	}
	
	
	@Override
	public String toString() {
		return "test [testId=" + testId + ", testName=" + testName + ", testType=" + testType + ", testDescription="
				+ testDescription + ", testCost=" + testCost + "]";
	}
	
}
