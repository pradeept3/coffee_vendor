package com.coffeecompany.coffeevendor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coffeecompany.coffeevendor.dto.CoffeeDto;

@Service
public interface CoffeeService {
	
	CoffeeDto getCoffeeById (Integer coffeeId);
	public void saveCoffee(CoffeeDto coffeeDto);
	List<CoffeeDto> getAllCoffees();

}
