package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.domain.ProductVO;

// ctrl + shift + o : 사용하지 않는 패키지 제거하는 단축키

@Controller
public class SampleController6 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController6.class);
	
	// 객체를 json형식으로 변환하여 클라이언트에게 보내는 작업.
	// 주로, Ajax기능에서 사용
	/*
	 	1)객체를 JSON형식으로 변환 : Jackson Databind 라이브러리
	 	2)JSON데이터를 클라이언트에게 보내는 작업 : @ResponseBody
	 */
	
	// http://localhost:8081/controller/doJSON
	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON() {
		
		ProductVO vo = new ProductVO("사과", 10000);
		
		// https://www.w3schools.com/js/js_json_datatypes.asp
		// vo -> JSON변환. Jackson Databind 라이브러리가 작업
		/*
		 	{"name":"사과","price":10000.0}
		*/
		
		return vo;
	}
}