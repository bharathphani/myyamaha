package com.myymaha.yamahaapi.service;

import com.myymaha.yamahaapi.dto.ProductDto;

public interface IProductService {
    public void createProduct(ProductDto productDto);
    public ProductDto getProduct(String id);
}
