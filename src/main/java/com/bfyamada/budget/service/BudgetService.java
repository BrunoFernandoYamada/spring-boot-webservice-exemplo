package com.bfyamada.budget.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfyamada.budget.core.dto.Budget;
import com.bfyamada.budget.dao.BudgetDAO;

@Service
public class BudgetService {
	
	@Autowired
	private BudgetDAO dao;
	
	public Budget getBudget(String id) {
		
		if(Integer.parseInt(id) < 0 || Integer.parseInt(id) > 12) {
			throw new RuntimeException("Not valid month!");
		}
		
		return dao.getBudgetById(id);
		
	}
	
	

}
