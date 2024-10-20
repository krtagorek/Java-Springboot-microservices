package com.rxk163.microservices.limits_service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rxk163.microservices.limits_service.bean.Limits;

@RestController
public class LimitsController {
	
	@Autowired
	private com.rxk163.microservices.limits_service.configuration.Configuration configuration;
	
	@GetMapping("/limits")
	public Limits getLimits() {
		
		//return new Limits(1,1000);
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
		
	}

}
