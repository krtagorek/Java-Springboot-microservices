package com.rxk163.rest.webservices.restful_web_services.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public MappingJacksonValue filtering() {
		
		ReturnBean returnBean = new ReturnBean("value1", "value2", "value3");
		
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(returnBean);
		SimpleBeanPropertyFilter philter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field3");
		FilterProvider filter = new SimpleFilterProvider().addFilter("returnBeanFilter", philter);
		mappingJacksonValue.setFilters(filter);
		
		return mappingJacksonValue;
	}
	
	@GetMapping("/filtering-list")
	public List<ReturnBean> filteringList() {
		return Arrays.asList(new ReturnBean("value1", "value2", "value3"),
				new ReturnBean("value4", "value5", "value6"));
	}
}
