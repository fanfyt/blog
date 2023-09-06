package com.liang.blog.service.impl;

import com.liang.blog.po.UserFile;
import com.liang.blog.mapper.UserFileMapper;
import com.liang.blog.service.IUserFileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户文件表 服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@Service
public class UserFileServiceImpl extends ServiceImpl<UserFileMapper, UserFile> implements IUserFileService {

}
