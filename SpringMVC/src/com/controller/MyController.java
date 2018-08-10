package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.javatraining.entity.Customer;

@Controller
public class MyController {

	@RequestMapping("/Go")
	public String pp()
	{
		return "mohan";
	}
	
	

	@RequestMapping("/data")
	public ModelAndView data(Customer customer)
	{
		return new ModelAndView("result","cust",customer);
	}
	

	@RequestMapping("/")
	public String pp1()
	{
		return "index";
	}
	
	
	@RequestMapping("/GoToHTML")
	public String GoToHTML()
	{
		return "GoToHTML";
	}
	

	@RequestMapping("/Customer")
	public ModelAndView customer()
	{
		return new ModelAndView("customer","command",new Customer());
	}
	
	
}
