package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FocusTimeApplicationcontroller {
	@GetMapping("/FocusTime")
	public String FocusTime() {
		//HTML=test.html
		return  "test";
	}

}
