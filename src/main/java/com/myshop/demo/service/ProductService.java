package com.myshop.demo.service;


import com.myshop.demo.dto.ProductDto;
import java.util.List;

public interface ProductService {
    List<ProductDto> getAll();
    void addToUserBucket(Long productId, String username);
    void addProduct(ProductDto dto);
    ProductDto getById(Long id);

}
