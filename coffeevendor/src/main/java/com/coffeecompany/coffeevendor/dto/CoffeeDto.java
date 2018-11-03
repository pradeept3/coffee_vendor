package com.coffeecompany.coffeevendor.dto;

import java.util.ArrayList;
import java.util.List;

public class CoffeeDto {
	private Integer coffeeId;
	
	private String coffeeName;
	private List<ProductDto>  productDto = new ArrayList();
	
	
	
	public CoffeeDto(Integer coffeeId, String coffeeName, List<ProductDto> productDto) {
		super();
		this.coffeeId = coffeeId;
		this.coffeeName = coffeeName;
		this.productDto = productDto;
	}
	public CoffeeDto(Integer coffeeId, String coffeeName) {

		this.coffeeId = coffeeId;
		this.coffeeName = coffeeName;
	}
	public Integer getCoffeeId() {
		return coffeeId;
	}
	public void setCoffeeId(Integer coffeeId) {
		this.coffeeId = coffeeId;
	}
	public String getCoffeeName() {
		return coffeeName;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	public List<ProductDto> getProductDto() {
		return productDto;
	}
	public void setProductDto(List<ProductDto> productDto) {
		this.productDto = productDto;
	}

}
