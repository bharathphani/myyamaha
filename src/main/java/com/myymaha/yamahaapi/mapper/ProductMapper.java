package com.myymaha.yamahaapi.mapper;

import com.myymaha.yamahaapi.dto.ProductDto;
import com.myymaha.yamahaapi.entity.Product;

public class ProductMapper {
    public static ProductDto mapToProductDto(Product product) {
        return new ProductDto(product.getId(), product.getName(), product.getPrice());
    }

    public static Product mapToProduct(ProductDto productDto) {
        return new Product(productDto.getId(), productDto.getName(), productDto.getPrice());
    }
}
