package com.chenkh.product.repository.impl;

import com.chenkh.product.entity.Product;
import com.chenkh.product.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Repository
public class DemoProductRepository implements ProductRepository {


   private  static final List<Product> demoUsers= Arrays.asList(
            Product.builder().id(1L).name("zhangsan").price(10f).build()    );


    @Override
    public Product findById(Long id) {
        return demoUsers.stream().filter(item-> Objects.equals(item.getId(),id)).findFirst().orElse(null);
    }
}
