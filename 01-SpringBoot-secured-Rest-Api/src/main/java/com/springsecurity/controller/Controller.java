package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller { 
	
	@GetMapping("/homes")
	public String gethome() {
		String msg ="welcome to spring security";
		return msg;
	}
	
	
	@GetMapping("/balance")
	public String getbalance() {
		String msg ="your current balance is : 15000 RS";
		return msg;
	}
	
	
	@GetMapping("/statement")
	public String getstatement() {
		String msg ="your statement is generated and sent to your email id successfully ";
		return msg;
	}
}
