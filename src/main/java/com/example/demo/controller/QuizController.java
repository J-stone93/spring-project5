package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	@GetMapping("q1")
	public void q1(Model model) {
		model.addAttribute("msg1", "이름: 둘리");
		model.addAttribute("msg2", "나이: 20");
		model.addAttribute("msg3", "주소: 인천 구월동");
	}
	
	@GetMapping("q2")
	public void q2(Model model) {
		model.addAttribute("msg4", "제목: 스프링부트웹프로젝트");
		model.addAttribute("msg5", "저자: 구멍가게 코딩단");
		model.addAttribute("msg6", "출간일: 2022-12-25");
	}
}
