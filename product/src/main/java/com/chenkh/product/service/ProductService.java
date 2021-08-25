package com.chenkh.product.service;

import com.chenkh.product.entity.Product;
import com.chenkh.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product findUserById(Long id){
        return productRepository.findById(id) ;
    }

}
