package com.daydayup.back.mapper.read;

import com.daydayup.back.entity.User;

public interface UserReadMapper {

    User getUserById(Integer id);

    User getUserByName(String name);
}
