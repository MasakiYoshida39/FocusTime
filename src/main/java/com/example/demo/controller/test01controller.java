package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class test01controller {
	@GetMapping("/wel")
	public String wel() {
		//HTML=test.html
		return  "test";
	}

}
