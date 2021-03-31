package com.cg.onlineeyecare.testcontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.cg.onlineeyecare.dto.test;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.onlineeyecare.exceptions.TestIdNotFoundException;
import com.cg.onlineeyecare.service.ITestService;

@SpringBootTest
public class test1 {
	@Autowired
	ITestService service;


	@Test
	void addtest() throws TestIdNotFoundException {
		test ts2 = new test(108, "Macular Degeneration", "laser therapy", "There are some prescription medications helpful in preventing the growth of abnormal blood vessels within the eye – Anti VEGF medicines, administered by injecting into the eye cavity.", 5145.2);
		service.addTest(ts2);
		assertEquals("laser therapy", service.viewTest(108).getTestType());
	}

	@Test
	void romovetest() throws TestIdNotFoundException {
		assertEquals(108, service.removeTest(108).getTestId());
	}

	@Test
	void viewtest() throws TestIdNotFoundException {
		assertEquals(8231.58, service.viewTest(101).getTestCost());
	}

	@Test
	void viewalltest() {
		assertEquals("LASIK Treatmement", service.viewAllTests().get(1).getTestType());
	}

	@Test
	void updatetest() throws TestIdNotFoundException {
		test test1 = new test(109, "Retinoscopy", "Laser Treatment", "Retinoscopy is an examination of the retina that provides an objective measurement of refractive error", 3453.67);
		service.updateTest(test1);
		assertEquals("Laser Treatment", service.viewTest(109).getTestType());
	}
}


