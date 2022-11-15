package com.pengsoo.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

	@RequestMapping(value = "test")
	   public String test() {
		
		MemberDto dto = new MemberDto("홍길동",10,"abc@com");
		System.out.println(dto.getName());
	      return "test";
	   }
	   
	}
	

