package com.liang.blog.mongodb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liang
 */
@Service
public class MgArticleService {

    public final ArticleRepository articleRepository;

    @Autowired
    public MgArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    /**
     * 保存文章
     *
     * @param articleData 文章数据
     * @return ArticleData
     */
    public ArticleData saveArticle(ArticleData articleData) {
        return articleRepository.save(articleData);
    }

    /**
     * 根据id查询文章
     *
     * @param id 文章id
     * @return ArticleData
     */
    public ArticleData findArticleById(String id) {
        return articleRepository.findById(id).orElse(null);
    }

    /**
     * 批量删除
     *
     * @param list 待删除文章id列表
     */
    public void delArticles(List<String> list) {
        articleRepository.deleteAllById(list);
    }

}
