package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * 
 * @author masaki
 *
 */
@Controller
public class FocusTimeApplicationcontroller {
	/**
	 * 
	 * @return test.html
	 */
	@GetMapping("/FocusTime")
	public String FocusTime() {
		return  "test";
	}

}
// /**Enter = JavaDocテンプレート作成
