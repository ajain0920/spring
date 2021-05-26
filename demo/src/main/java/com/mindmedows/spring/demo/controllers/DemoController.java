package com.mindmedows.spring.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mindmedows.spring.demo.domain.Demo;
import com.mindmedows.spring.demo.services.DemoService;

@Controller("/demo")
public class DemoController {
	
	@Autowired
	DemoService demoService;

	@RequestMapping("/demo")
	public ModelAndView startDemo() {
		
		Demo demo = demoService.getDemo();
		return new ModelAndView("index.html", "demo", demo);
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	
}
