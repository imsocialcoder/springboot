package com.uulku.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uulku.assignment.service.SumServiceImpl;

@SpringBootTest
class SpringBootAssignment1ApplicationTests {

	@Autowired
	SumServiceImpl service;
	
	
	@Test
	public void testSum() {
		assertEquals(7, service.getSum(4, 3));
	}

}
