package com.bfyamada.budget.dao;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.bfyamada.budget.core.dto.Budget;

@Component
public class BudgetDAO {
	
	private static final Map<String, Budget> budgets = new HashMap<>();
	
	@PostConstruct
	public void initData() {
		
		Budget budgetJanuary = new Budget();
		budgetJanuary.setId("1");
		budgetJanuary.setTittle("Energia");
		budgetJanuary.setMonth("01");
		budgetJanuary.setValue(209.90);
		
		budgets.put(budgetJanuary.getId(), budgetJanuary);
		
		Budget budgetFebruary = new Budget();
		budgetFebruary.setId("2");
		budgetFebruary.setTittle("Energia");
		budgetFebruary.setMonth("02");
		budgetFebruary.setValue(198.93);
		
		budgets.put(budgetFebruary.getId(), budgetFebruary);
		
		Budget budgetMarch = new Budget();
		budgetMarch.setId("3");
		budgetMarch.setTittle("Energia");
		budgetMarch.setMonth("03");
		budgetMarch.setValue(78.90);
		
		budgets.put(budgetMarch.getId(), budgetMarch);
		
	}
	
	public Budget getBudgetById(String id) {
		Assert.notNull(id, "The budget's id must not be null");
		return budgets.get(id);
	}

}
