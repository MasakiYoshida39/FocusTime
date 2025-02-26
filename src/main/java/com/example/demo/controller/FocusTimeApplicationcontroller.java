package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.Learning;
import com.example.demo.form.TestForm;
import com.example.demo.service.RegistService;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class FocusTimeApplicationcontroller {
	
	private final RegistService service;

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
				RedirectAttributes redirectAttributes) {
			
			if (result.hasErrors()) {
				return "n";
			}
			Learning l = new Learning();
//			l.setUserId(form.gettUserId());
			l.setStudy(form.getStudy());
			l.setStudyhours(form.getStudyhours());
			l.setSubject(form.getSubject());
			l.setComment(form.getComment());
			service.regist(l);
			
			redirectAttributes.addFlashAttribute("msg", "(レビュー登録)");
			
			return "redirect:/complete";
		}
	

}




