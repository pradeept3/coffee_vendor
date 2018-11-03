package com.coffeecompany.coffeevendor.dto;

import java.util.ArrayList;
import java.util.List;

public class ProductDto {

	private Integer productId;

	private String productName;
	
	private List<CoffeeDto> coffeeDto = new ArrayList();
	
	

	public ProductDto(Integer productId, String productName, List<CoffeeDto> coffeeDto) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.coffeeDto = coffeeDto;
	}

	public ProductDto(Integer productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<CoffeeDto> getCoffeeDto() {
		return coffeeDto;
	}

	public void setCoffeeDto(List<CoffeeDto> coffeeDto) {
		this.coffeeDto = coffeeDto;
	}


}
