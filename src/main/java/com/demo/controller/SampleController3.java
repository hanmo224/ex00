package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController3 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	// 파라미터가 있는 메소드 호출
	
	// ? 뒤에 문자열을 쿼리스트링(QueryString)이라 한다.
	// http://localhost:8081/controller/doG?name=abc&age=100
	@RequestMapping("doG")
	public String doG(String name, int age) {
		
		logger.info("이름은? " + name);
		logger.info("나이는? " + age);
		
		return "testG";
	}
	
	// http://localhost:8081/controller/doH?name=홍길동
	
	// 참조데이터 타입의 매개변수에 값을 제공하지 않을 때
	// http://localhost:8081/controller/doH	에러발생되지 않음
	@RequestMapping("doH")
	public String doH(String name) {
		
		logger.info("이름은? " + name);
		
		return "testH";
	}
	
	// http://localhost:8081/controller/doI?age=100
	
	// 기본데이터 타입의 매개변수에 값을 제공하지 않을 때
	// http://localhost:8081/controller/doI	에러발생됨
	@RequestMapping("doI")
	public String doI(int age) {
		
		logger.info("나이는? " + age);
		
		return "testI";
	}
}
