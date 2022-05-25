package com.msb.service;

import com.msb.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    public List<User> findAllUser();
}
