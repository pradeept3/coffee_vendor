package com.coffeecompany.coffeevendor.entity;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Coffee implements Serializable{

	public Coffee(String coffeeName, List<Product> products) {
		this.coffeeName = coffeeName;
		this.products = products;
	}

	@Column
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Id
	private Integer coffeeId;
	
	@Column
	private String coffeeName;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Product> products = new LinkedList<>();


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

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}



}
