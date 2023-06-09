package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	
	// SampleController 클래스 동작시 기록을 담당할 로그객체 생성구문.
	// 없어도 됨
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	// 매핑이름과 메소드명은 상관이 없다.
	// 매핑이름과 jsp파일명이 동일한 경우 메소드의 리턴타입은 void로 해야한다.
	
	// http://localhost:8081/controller/doA
	@RequestMapping("doA") // 매핑주소. 클라이언트에서 스프링의 메소드를 호출하는 목적으로 사용.
	public void doA() {
		logger.info("doA called...");
		
		// /WEB-INF/views/ + doA + .jsp -> /WEB-INF/views/doA.jsp
	}
	
	// http://localhost:8081/controller/doB
	@RequestMapping("doB")
	public void doB() {
		logger.info("doB called...");
	}
	
	// http://localhost:8081/controller/doC
	@RequestMapping("doC")
	public void doC() {
		logger.info("doC called...");
	}
}