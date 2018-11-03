package com.coffeecompany.coffeevendor.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GeneratorType;



public class Product {

	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer productId;
	@Column
	private String productName;
	@ManyToOne
	private Coffee coffee;

	public Product(String productName, Coffee coffee) {
		this.productName = productName;
		this.coffee = coffee;
	}

	public Product(String productName) {
		super();
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

	public Coffee getCoffee() {
		return coffee;
	}

	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}


}
