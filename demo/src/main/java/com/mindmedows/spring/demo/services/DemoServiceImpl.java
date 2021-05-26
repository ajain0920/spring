package com.mindmedows.spring.demo.services;

import org.springframework.stereotype.Service;

import com.mindmedows.spring.demo.domain.Demo;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public Demo getDemo() {
		return new Demo("Demo", "Testing First Demo!");
	}

}
