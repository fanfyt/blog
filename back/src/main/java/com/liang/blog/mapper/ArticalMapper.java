package com.liang.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liang.blog.po.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文章数据库接口
 *
 * @author liang
 */
@Mapper
public interface ArticalMapper extends BaseMapper<Article> {

}
