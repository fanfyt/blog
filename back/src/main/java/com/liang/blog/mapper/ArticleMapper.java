package com.liang.blog.mapper;

import com.liang.blog.po.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

    Object list();
}
