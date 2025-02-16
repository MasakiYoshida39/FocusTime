package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * 
 * @author masaki
 *
 */
@Controller
public class FocusTimeApplicationcontroller {
	/**
	 * 
	 * @return input.html
	 */
	
	//入力画面遷移
		@GetMapping("/input")
		public String input() {
			return "input";
		}
		
		
		/**
		 * 
		 * @return test.html
		 */
		// /post-paramのポストからリクエストを受け取る
		@PostMapping("/post-param")
		//content=科目
		public String postParam(@RequestParam String content,
				Model model) {
			model.addAttribute("mGreeting", content);
			
			return "test";
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/**
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
	*/
		
		
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
