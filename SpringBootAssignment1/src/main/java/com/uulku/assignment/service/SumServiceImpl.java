package com.uulku.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uulku.assignment.dao.SumDAO;

@Service
public class SumServiceImpl implements SumService {
	@Autowired
	private SumDAO sumDAO;

	public SumDAO getSumDAO() {
		return sumDAO;
	}

	public void setSumDAO(SumDAO sumDAO) {
		this.sumDAO = sumDAO;
	}
	
	public int getSum(int a, int b) {
		return a+b;
	}
}
