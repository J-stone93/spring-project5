package com.example.demo.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.SampleDTO;

@Controller
@RequestMapping("/sample")
public class SampleController {

	@GetMapping("/ex1") // sample/ex1
	public void ex1() {
		// return type이 void: url 주소가 html 경로가됨
		// return type이 String: html 경로를 직접 정할 수 있음
	}
	
	@GetMapping("/ex2") // sample/ex2
	public void ex2(Model model) { // moder: 화면에 데이터를 전달하는 클래스
		model.addAttribute("msg", "안녕하세요"); // 컨트롤러 > 화면으로 전달
	}
	
	@GetMapping("/ex3")
	public void ex3(Model model) {
		model.addAttribute("msg1", "안녕하세요");
		model.addAttribute("msg2", "반갑습니다");
		
		// moder 객체에 데이터를 여러번 담을 수 있음
	}
	
	@GetMapping("/ex4")
	public void ex4(Model model) {
		//LocalDate.of는 수동으로 날짜 넣기 LocalDate.now는 현재 날짜 자동 넣기
		SampleDTO sampleDTO = new SampleDTO(1, "hello", LocalDate.now());
		
		model.addAttribute("dto", sampleDTO); 
		
	}
	// 하나의 메소드가 /ex5, /ex6, /ex7, /ex8 모든 요청을 처리
	// 각 화면에 동일한 데이터를 전달하기 위한 것
	@GetMapping({"/ex5", "/ex6", "/ex7", "/ex8"})
	public void ex5(Model model) {
		
		List<SampleDTO> list = new ArrayList<>();
		
		list.add(new SampleDTO(1, "aaa", LocalDate.now()));
		list.add(new SampleDTO(2, "bbb", LocalDate.now()));
		list.add(new SampleDTO(3, "ccc", LocalDate.now()));
		
		model.addAttribute("list", list); // 화면에 리스트 전달
		
	}
	
	@GetMapping("/ex9")
	public void ex9(Model model) {
		
		SampleDTO sampleDTO = new SampleDTO(1, "aaa", LocalDate.now());
		
		model.addAttribute("result", "success");
		model.addAttribute("dto", sampleDTO);
		
	}
	
}
 













