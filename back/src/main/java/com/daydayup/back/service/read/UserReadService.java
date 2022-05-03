package com.daydayup.back.service.read;

import com.daydayup.back.entity.User;

public interface UserReadService {
    User getUserById(Integer id);

    User getUserByName(String user);
}
