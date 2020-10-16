package com.sp.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sp.test.vo.TestVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class TestController {


	@GetMapping("/upload")
	public String test() {
		return "/upload";
	}
	@PostMapping("/upload")
	public String doTest(@ModelAttribute TestVO tvo,Model model) {
		System.out.println(tvo.getFile().getOriginalFilename());
		log.info("tvo=>{}",tvo);
		model.addAttribute("tvo",tvo);
		return "complete";
		
	}
	
}
