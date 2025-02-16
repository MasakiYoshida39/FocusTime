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
	
	
	    //modelのやり方
		@GetMapping("/FocusTime")
		//public Stringは変えられない
		
		public String FocusTimemodel(Model model) {
			//bodyweight=体重
			model.addAttribute("bodyweight", "799");
			//Content=科目
			model.addAttribute("Content", "理科");
			return "test";
		}
		
		
		
		/**
		//ModelAndViewのやり方
		@GetMapping("/FocusTime-mv")
		
		public ModelAndView FocusTimeeMv(ModelAndView mv) {
			//bodyweight=体重
			mv.addObject("bodyweight", "7999");
			//Content=科目
			mv.addObject("Content", "科目");
			mv.setViewName("test");
			
			return mv;
		}
		*/

}




// /**Enter = JavaDocテンプレート作成
