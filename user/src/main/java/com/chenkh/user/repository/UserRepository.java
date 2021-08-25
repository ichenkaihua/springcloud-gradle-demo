package com.chenkh.user.repository;

import com.chenkh.user.entity.User;
import org.springframework.stereotype.Repository;

public interface UserRepository {

     User findById(Long id);



}
