package com.pengsoo.shop;

import org.springframework.stereotype.Controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Controller
public class MemberDto {

	private String name;
	private int age;
	private String email;
}
