package com.chenkh.user.repository.impl;

import com.chenkh.user.entity.User;
import com.chenkh.user.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Repository
public class DemoUserRepository  implements UserRepository {


   private  static final List<User> demoUsers= Arrays.asList(
            User.builder().id(1L).name("zhangsan").password("zsUasdff").build(),
            User.builder().id(2L).name("lisi").password("lsPass").build(),
            User.builder().id(3L).name("wangwu").password("wwPass").build()
    );


    @Override
    public User findById(Long id) {
        return demoUsers.stream().filter(item-> Objects.equals(item.getId(),id)).findFirst().orElse(null);
    }
}
