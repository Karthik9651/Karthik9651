package com.cg.onlineeyecare.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlineeyecare.dto.test;

/************************************************************************************
 *          @author          G.Karthik kumar Reddy
 *          Description      It is a test repository interface that extends jpa repository 
 *                           that contains inbuilt methods for various operations
  *         Version             1.0
  *         Created Date      22-MARCH-2021
 ************************************************************************************/
public interface ITestRepository extends JpaRepository<test, Integer> {

	
}
