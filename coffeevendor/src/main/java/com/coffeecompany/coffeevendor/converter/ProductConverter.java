package com.coffeecompany.coffeevendor.converter;

import com.coffeecompany.coffeevendor.dto.ProductDto;
import com.coffeecompany.coffeevendor.entity.Product;

public class ProductConverter {

	public static Product dtoToEntity(ProductDto productDto)
	{
		Product product = new Product(productDto.getProductName(),null);
		product.setProductId(productDto.getProductId());
		
		return product;
	}
	
	public static ProductDto entityToDto (Product product) 
	{
		return new ProductDto(product.getProductId(), product.getProductName());
		
	}
}
