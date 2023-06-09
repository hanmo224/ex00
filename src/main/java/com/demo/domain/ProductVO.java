package com.demo.domain;


// 시나리오 : 상품테이블의 구조를 내용으로 한 클래스. VO(Value Object)클래스.
public class ProductVO {
	
	// 스프링으로 자바를 사용할때 필드는 반드시 private로 한다.
	private String name;
	private double price;
	
	public ProductVO(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ProductVO [name=" + name + ", price=" + price + "]";
	}
	
}
