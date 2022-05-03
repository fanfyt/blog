package com.daydayup.back.securityService.read;

import com.daydayup.back.entity.Authority;

import java.util.List;

public interface AuthorityService {
    //通过username查看用户权限
    List<Authority> getAuthoritiesByUsername(String username);
}
