package com.bfyamada.budget.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.bfyamada.budget.core.dto.GetBudgetRequest;
import com.bfyamada.budget.core.dto.GetBudgetResponse;
import com.bfyamada.budget.service.BudgetService;


@Endpoint
public class BudgetEndpoint {
	
	private static final String NAMESPACE_URI = "http://bfyamada.com/budget/core/dto";

	@Autowired
	private BudgetService budgetService;


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBudgetRequest")
	@ResponsePayload
	public GetBudgetResponse getBudget(@RequestPayload GetBudgetRequest request) {
		GetBudgetResponse response = new GetBudgetResponse();
		response.setBudget(budgetService.getBudget(request.getId()));

		return response;
	}

}
