package com.liang.blog.service.impl;

import com.liang.blog.po.FileArticleRelation;
import com.liang.blog.mapper.FileArticleRelationMapper;
import com.liang.blog.service.IFileArticleRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文件-文章关联表 服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@Service
public class FileArticleRelationServiceImpl extends ServiceImpl<FileArticleRelationMapper, FileArticleRelation> implements IFileArticleRelationService {

}
