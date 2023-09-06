package com.liang.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liang.blog.mapper.TagRelationMapper;
import com.liang.blog.po.TagRelation;
import com.liang.blog.service.ITagRelationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章-标签-关联表 服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@Service
public class TagRelationServiceImpl extends ServiceImpl<TagRelationMapper, TagRelation> implements ITagRelationService {

}
