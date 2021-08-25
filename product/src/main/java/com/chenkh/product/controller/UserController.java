package com.chenkh.product.controller;

import com.chenkh.common.Msg;
import com.chenkh.product.entity.Product;
import com.chenkh.product.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RequestMapping("users")
@RestController
public class UserController {

    private final ProductService productService;

    public UserController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("{id}")
    public Msg<Product> loadUser(@PathVariable Long id){
        Product product = productService.findUserById(id);
        if(Objects.isNull(product)){
            Msg.failMsg("用户不存在");
        }
        return Msg.successMsg(product);
    }

}
