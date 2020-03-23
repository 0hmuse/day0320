package com.example.demo.comtroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestLoginController {

	@RequestMapping(value = "/ActionWithData", produces = "text/plaine;charset=UTF-8")
	public String actionWithData(String name, int age) {
		String str="";
		
		System.out.println("ajax통신입니다.");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		
		str = "<h2>로그인하였습니다.</h2>";
		
		return str;
	}
}
