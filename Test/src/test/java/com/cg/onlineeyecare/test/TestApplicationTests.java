package com.cg.onlineeyecare.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.onlineeyecare.service.ITestServiceImpl;




@SpringBootTest
class TestApplicationTests {
	@Autowired
	ITestServiceImpl testser;
    @Test
	void contextLoads() {

	}

}
