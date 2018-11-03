package com.coffeecompany.coffeevendor.service.impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeecompany.coffeevendor.converter.CoffeeConverter;
import com.coffeecompany.coffeevendor.dto.CoffeeDto;
import com.coffeecompany.coffeevendor.repository.CoffeeRepository;
import com.coffeecompany.coffeevendor.service.CoffeeService;


@Service
public class CoffeeServiceimpl implements CoffeeService {
	
	@Autowired
	CoffeeRepository coffeeRepository;
	
	@Override
	public CoffeeDto getCoffeeById(Integer coffeeId)
	{
		return CoffeeConverter.entityToDto(coffeeRepository.getOne(coffeeId));
	}
	
	@Override
	public void saveCoffee(CoffeeDto coffeeDto)
	{
		coffeeRepository.save(CoffeeConverter.dtoToEntity(coffeeDto));
	}
	@Override
	public List<CoffeeDto> getAllCoffees()
	{
		return coffeeRepository.findAll().stream().map(CoffeeConverter::entityToDto).collect(Collectors.toList());
	}
}
