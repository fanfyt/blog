package com.liang.blog.service;

import com.liang.blog.model.ArticleModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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
    boolean saveArticleModel(ArticleModel articleModel);

    /**
     * 根据文章id获取文章
     *
     * @param id 文章id
     * @return 文章对象
     */
    ArticleModel getByArticleId(String id);


    /**
     * 根据作者id获取文章列表
     *
     * @param authorId 作者id
     * @return
     */
    List<Object> getArticleContentByAuthorId(Long authorId);

    /**
     * 删除文章
     *
     * @param list 待删除文章id列表
     * @return boolean
     */
    boolean del(List<String> list);
}
