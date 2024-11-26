package com.myymaha.yamahaapi.service.impl;

import com.myymaha.yamahaapi.dto.ProductDto;
import com.myymaha.yamahaapi.entity.Product;
import com.myymaha.yamahaapi.entity.User;
import com.myymaha.yamahaapi.exception.ResourceNotFoundException;
import com.myymaha.yamahaapi.mapper.ProductMapper;
import com.myymaha.yamahaapi.mapper.UserMapper;
import com.myymaha.yamahaapi.repository.ProductRepository;
import com.myymaha.yamahaapi.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements IProductService {

    private ProductRepository productRepo;

    @Override
    public void createProduct(ProductDto productDto) {
        Product product = ProductMapper.mapToProduct(productDto);
        product.setCreatedOn(LocalDateTime.now());
        product.setCreatedBy("Bharath");
        product.setModifiedOn(LocalDateTime.now());
        product.setModifiedBy("Bharath");
        productRepo.save(product);
    }

    @Override
    public ProductDto getProduct(String id) {
        Product product = productRepo.findById(Long.parseLong(id)).orElseThrow(
                () -> new ResourceNotFoundException("Product", "id", id)
        );
        return ProductMapper.mapToProductDto(product);
    }

}
