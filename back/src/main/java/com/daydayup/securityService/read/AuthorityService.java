package com.daydayup.securityService.read;

import com.daydayup.entity.Authority;

import java.util.List;

public interface AuthorityService {
    //通过username查看用户权限
    List<Authority> getAuthoritiesByUsername(String username);
}
