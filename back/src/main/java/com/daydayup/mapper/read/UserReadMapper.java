package com.daydayup.mapper.read;

import com.daydayup.entity.User;

public interface UserReadMapper {

    User getUserById(Integer id);

    User getUserByName(String name);
}
