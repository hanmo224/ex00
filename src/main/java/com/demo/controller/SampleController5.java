package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController5 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController5.class);
	
	// 리다이렉트(Redirect) 와 RedirectAttributes 인터페이스 사용법.
	// String 쓰는 경우 : jsp명을 다르게 할경우, 리다이렉트 기능을 쓸 경우
	@RequestMapping("doM")
	public String doM(RedirectAttributes rttr) {
		
		// 데이터베이스 작업(insert, update, delete 등)
		
		// http://localhost:8081/controller/doN?title=spring+study&idx=10
		rttr.addAttribute("title", "spring study");
		rttr.addAttribute("idx", 10);
		
		// return "redirect:/doN?idx=10"; // return "redirect:/매핑주소"; void이면 못쓴다. jsp파일명 필요 없음
		return "redirect:/doN";
	}
	
	@RequestMapping("doN")
	public void doN(String title, int idx) {
		logger.info("리다이렉트 요청으로 진행됨.");
		logger.info("글제목 : " + title);
		logger.info("글번호 : " + idx);
	}
	
	/*************************************************************************************/
	
	@RequestMapping("doO")
	public String doO(RedirectAttributes rttr) {
		
		rttr.addFlashAttribute("msg", "ok"); // 리다이렉트되는 주소의 jsp에서 자바스크립트 구문에서 이용
											 // 한번만 참조된다.
		return "redirect:/doP";	// jsp가 필요없다.
	}
	
	@RequestMapping("doP")
	public void doP() {
		logger.info("리다이렉트 요청으로 진행됨");
		
		// doP.jsp에서 데이터를 참조. msg키를 이용하여 "ok"문자열 데이터를 사용이 가능해짐.
	}
}
