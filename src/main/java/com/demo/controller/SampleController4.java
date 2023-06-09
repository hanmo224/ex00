package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.domain.ProductVO;

@Controller
public class SampleController4 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	
	// 파라미터에 @ModelAttribute 어노테이션 사용
	// 일반적으로는 @ModelAttribute 이름과 파라미터명을 일치하여 사용한다
	// 파라미터의 값을 jsp에서 참조하고자 할 경우
	
	// http://localhost:8081/controller/doJ?name=홍길동&age=100
	@RequestMapping("doJ")
	public String doJ(@ModelAttribute("name") String name, @ModelAttribute("age") int age) {
		
		logger.info("이름은? " + name);
		logger.info("나이는? " + age);
		
		return "testJ";		// testJ.jsp에서 매개변수의 값을 사용하고자 할 경우.
	}
	
	// 파라미터 값을 제공해도 @ModelAttribute를 사용 안하면, jsp에서 참조가 안됨
	// http://localhost:8081/controller/doK?name=홍길동&age=100
	
	@RequestMapping("doK")
	public String doK(String name, int age) {
		
		logger.info("이름은? " + name);
		logger.info("나이는? " + age);
		
		return "testK";	
	}
	
	// ProductVO 클래스 먼저 구성 할 것.
	// Model model 파리미터는 클라이언트에서 정보를 제공하는 것이 아니라, 스프링 자체에서 처리를 해준다.
	// Model 객체 : 메소드 안의 데이터(객체)를 뷰(jsp)에 전달하는 기능을 제공.
	@RequestMapping("doL")
	public String doL(Model model) {
		
		// 데이터. 실제작업은 DB에서 읽어옴.
		ProductVO product = new ProductVO("사과", 10000);
		
		logger.info("상품정보는: " + product); // product.toString()
		
		// 작업. jsp에서 사용 가능해짐
		model.addAttribute("product", product); // model.addAttribute("jsp참조이름", product);
		
		return "productInfo";	// 뷰(view) - 화면작업. jsp언어. 예>스프링부트 - 타임리프. jsp 등
	}
}