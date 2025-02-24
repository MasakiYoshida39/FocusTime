package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.TestForm;
import com.example.demo.service.RegistService;
import com.example.demo.service.RegistServiceImpl;
/**
 * 
 * @author masaki
 *
 */
@Controller
public class FocusTimeApplicationcontroller {

	//入力画面遷移
		@GetMapping("/input")
		public String shoewReview(@ModelAttribute TestForm form) {
			return "input";
		}
	
		/*--- レビュー登録画面表示リクエスト（確認画面からの戻り） ---*/
		@PostMapping("/n-ret")
		public String showReviewFormRet(
				@ModelAttribute TestForm form
				) {
			
			
			
			return "input";
		}
		
		/*--- 内容登録リクエスト（登録画面より） ---*/
		@PostMapping("/n")
		public String registReview(
				@Validated @ModelAttribute TestForm form,
				BindingResult result) {
			
			if (result.hasErrors()) {
				return	"input";
			}
			
			
			return "test";
		}
		
		/*--- レビュー登録リクエスト（登録確認画面より） ---*/
		@PostMapping("/test")
		public String confirmRegistReview(TestForm form,
				BindingResult result,
				Model model) {
			
			if (result.hasErrors()) {
				return "n";
			}
			RegistService service = new RegistServiceImpl();
			//テスト用を通す
//          RegistService service = new RegistServiceMock();
			String msg = service.regist();
			
			model.addAttribute("msg", msg);
			
			return "complete";
		}
	

}




