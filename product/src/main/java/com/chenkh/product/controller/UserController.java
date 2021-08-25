package com.chenkh.product.controller;

import com.chenkh.common.Msg;
import com.chenkh.user.entity.User;
import com.chenkh.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RequestMapping("users")
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("{id}")
    public Msg<User> loadUser(@PathVariable Long id){
        User user = userService.findUserById(id);
        if(Objects.isNull(user)){
            Msg.failMsg("用户不存在");
        }
        return Msg.successMsg(user);
    }

}
