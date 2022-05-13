package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {
	
	@GetMapping
	public String sayHello() {
		return "WELCOME TO HM INFOTECH";
	}
	@GetMapping("/address")
	public String sayAddress() {
		return "SILICON VALLEY || PUNE";
	}
	@GetMapping("/service")
	public String sayServices() {
		return "PRODUCT BASE AND SERVICE BASE COMPANY";
	}

}
