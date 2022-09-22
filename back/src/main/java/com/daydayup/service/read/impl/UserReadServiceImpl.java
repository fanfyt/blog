package com.daydayup.service.read.impl;

import com.daydayup.entity.User;
import com.daydayup.mapper.read.UserReadMapper;
import com.daydayup.service.read.UserReadService;

import javax.annotation.Resource;

/**
 * @author FL
 */
public class UserReadServiceImpl implements UserReadService {

    @Resource
    private UserReadMapper userReadMapper;
    @Override
    public User getUserById(Integer id) {
        return userReadMapper.getUserById(id);
    }

    @Override
    public User getUserByName(String name) {
        return userReadMapper.getUserByName(name);
    }


}
