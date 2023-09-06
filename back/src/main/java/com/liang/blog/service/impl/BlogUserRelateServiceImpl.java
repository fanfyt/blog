package com.liang.blog.service.impl;

import com.liang.blog.po.BlogUserRelate;
import com.liang.blog.mapper.BlogUserRelateMapper;
import com.liang.blog.service.IBlogUserRelateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 关注用户关联表 服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@Service
public class BlogUserRelateServiceImpl extends ServiceImpl<BlogUserRelateMapper, BlogUserRelate> implements IBlogUserRelateService {

}
