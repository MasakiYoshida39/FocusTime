package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	//modelのやり方
		@GetMapping("/FocusTime")
		//public Stringは変えられない
		
		public String FocusTimemodel(Model model) {
			//bodyweight=体重
			model.addAttribute("bodyweight", "7999");
			model.addAttribute("welcome", "Welcome MVC (Model)");
			return "test";
		}

}




// /**Enter = JavaDocテンプレート作成
