package com.liang.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liang.blog.mapper.UserZoneMapper;
import com.liang.blog.po.UserZone;
import com.liang.blog.service.IUserZoneService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户空间 服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@Service
public class UserZoneServiceImpl extends ServiceImpl<UserZoneMapper, UserZone> implements IUserZoneService {

}
