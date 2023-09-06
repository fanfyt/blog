package com.liang.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liang.blog.mapper.LikingMapper;
import com.liang.blog.po.Liking;
import com.liang.blog.service.ILikingService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@Service
public class LikingServiceImpl extends ServiceImpl<LikingMapper, Liking> implements ILikingService {

}
