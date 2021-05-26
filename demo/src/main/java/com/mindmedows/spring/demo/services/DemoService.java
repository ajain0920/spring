package com.mindmedows.spring.demo.services;

import org.springframework.stereotype.Service;

import com.mindmedows.spring.demo.domain.Demo;

@Service
public interface DemoService {

	public Demo getDemo();
}
