package com.myymaha.yamahaapi.controller;

import com.myymaha.yamahaapi.constants.Constants;
import com.myymaha.yamahaapi.dto.ProductDto;
import com.myymaha.yamahaapi.dto.ResponseDto;
import com.myymaha.yamahaapi.dto.UserDto;
import com.myymaha.yamahaapi.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ProductController extends BaseController{
    IProductService iProductService;

    @GetMapping(path = "sayHello")
    public String sayHello() {
        return "Hello to My yamaha products";
    }

    @PostMapping(path = "create")
    public ResponseEntity<ResponseDto> createProduct(@RequestBody ProductDto productDto) {
        iProductService.createProduct(productDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(Constants.HTTP_CODE_201, Constants.PRODUCT_SUCCESS_MSG_201));
    }

    @GetMapping(path= "fetch")
    public ResponseEntity<ProductDto> getProductById(@RequestParam String id) {
        ProductDto productDto = iProductService.getProduct(id);
        return ResponseEntity.status(HttpStatus.OK).body(productDto);
    }
}
