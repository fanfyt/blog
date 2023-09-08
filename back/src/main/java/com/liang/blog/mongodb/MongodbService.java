package com.liang.blog.mongodb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liang
 */
@Service
public class MongodbService {

    public final ArticleRepository aricleRepository;

    @Autowired
    public MongodbService(ArticleRepository aricleRepository) {
        this.aricleRepository = aricleRepository;
    }

    /**
     * 保存文章
     *
     * @param articleData 文章数据
     * @return ArticleData
     */
    public ArticleData saveArticle(ArticleData articleData) {
        return aricleRepository.save(articleData);
    }

    /**
     * 根据id查询文章
     *
     * @param id 文章id
     * @return ArticleData
     */
    public ArticleData findArticleById(String id) {
        return aricleRepository.findById(id).orElse(null);
    }

}
