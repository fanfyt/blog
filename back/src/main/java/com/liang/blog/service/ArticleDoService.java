package com.liang.blog.service;

import com.liang.blog.model.ArticleModel;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liang
 */
@Mapper
public interface ArticleDoService {


    /**
     * 保存文章到 mysql+mongodb
     *
     * @param articleModel 文章
     */
    void saveArticleModel(ArticleModel articleModel);
}
