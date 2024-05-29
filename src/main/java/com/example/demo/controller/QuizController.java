package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.BookDTO;
import com.example.demo.dto.PersonDTO;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	@GetMapping("/q1")
	public void q1(Model model) { 
		//model: 뷰에 데이터를 전달하는 객체
		//addAttribute: 모델에 데이터를 담는 함수
		//addAttribute("변수이름", "value")
		model.addAttribute("msg1", "둘리");
		model.addAttribute("msg2", "20");
		model.addAttribute("msg3", "인천 구월동");
	}
	
	@GetMapping("/q2")
	public void q2(Model model) {
		model.addAttribute("msg4", "스프링부트웹프로젝트");
		model.addAttribute("msg5", "구멍가게 코딩단");
		model.addAttribute("msg6", LocalDate.of(2022, 12, 25));
	}
	
	@GetMapping("/q3")
	public void q3(Model model) {
		
		PersonDTO personDTO = new PersonDTO("둘리", 20, "인천 구월동");
		
		model.addAttribute("person", personDTO);
		
	}
	
	@GetMapping("/q4")
	public void q4(Model model) {
		
		BookDTO bookDTO = new BookDTO("스프링부트웹프로젝트", "구멍가게코딩단", LocalDate.of(2022, 12, 25));
		
		model.addAttribute("book", bookDTO);
	}
}















