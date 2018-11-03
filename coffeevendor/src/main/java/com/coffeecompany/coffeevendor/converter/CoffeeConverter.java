package com.coffeecompany.coffeevendor.converter;

import java.util.stream.Collectors;

import com.coffeecompany.coffeevendor.dto.CoffeeDto;
import com.coffeecompany.coffeevendor.entity.Coffee;

public class CoffeeConverter {

	public static Coffee dtoToEntity(CoffeeDto coffeeDto)
	{
		Coffee coffee = new Coffee(coffeeDto.getCoffeeName(), null);
		coffee.setCoffeeId(coffeeDto.getCoffeeId());
		//coffee.setCoffeeName(coffeeDto.getCoffeeName());
		coffee.setProducts(
				coffeeDto.getProductDto()
				.stream()
				.map(ProductConverter::dtoToEntity)
				.collect(Collectors.toList())
				);
		return coffee;
	}

	public static CoffeeDto entityToDto (Coffee coffee)
	{
		CoffeeDto coffeeDto = new CoffeeDto(coffee.getCoffeeId(), coffee.getCoffeeName(),null);
		coffeeDto.setProductDto(
				coffee.getProducts()
				.stream()
				.map(ProductConverter::entityToDto)
				.collect(Collectors.toList()));

		return coffeeDto;
	}

}
