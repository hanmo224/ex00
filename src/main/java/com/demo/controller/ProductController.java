package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.domain.ProductVO;

@Controller
public class ProductController {

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@RequestMapping("productForm")
	public void productForm () {
		logger.info("상품등록 페이지");
	}
	
	// 데이터 입력시 메소드의 파라미터를 클래스로 사용 할 경우
	// 클라이언트의 파라미터명을 ProductVO클래스의 필드명과 일치해야 한다.
	// 그리고, 내부에서는 setter 메소드가 동작된다.
	@RequestMapping("productInsert")
	public void productInsert(ProductVO vo) {
		logger.info("상품정보는? " + vo);
	}
	
}
