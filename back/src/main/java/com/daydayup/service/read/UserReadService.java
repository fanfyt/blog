package com.daydayup.service.read;

import com.daydayup.entity.User;

/**
 * @author FL
 */
public interface UserReadService {

    User getUserById(Integer id);

    User getUserByName(String user);
}
