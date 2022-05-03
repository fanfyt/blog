package com.daydayup.back.service.read.impl;

import com.daydayup.back.entity.User;
import com.daydayup.back.mapper.read.UserReadMapper;
import com.daydayup.back.service.read.UserReadService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserReadServiceImpl implements UserReadService {

    @Autowired
    private UserReadMapper userReadMapper;
    @Override
    public User getUserById(Integer id) {
        User resultUser = userReadMapper.getUserById(id);
        return resultUser;
    }

    @Override
    public User getUserByName(String name) {
        User user1 = userReadMapper.getUserByName(name);
        return null;
    }


}
