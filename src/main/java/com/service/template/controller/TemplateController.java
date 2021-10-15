package com.service.template.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.template.model.Greeting;

@RestController
@RequestMapping(value="/template", headers = "accept=application/json")
public class TemplateController {
	
	private static final String template = "Hello, %s!";
	private AtomicLong counter = new AtomicLong();
	
	@GetMapping(value = "/", headers = "accept=application/json")
	public Greeting templateGreeting() {
		return new Greeting(counter.incrementAndGet(), String.format(template, "Welcome to service template"));
	}

}
