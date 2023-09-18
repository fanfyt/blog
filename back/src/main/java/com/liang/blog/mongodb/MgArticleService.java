package com.liang.blog.mongodb;


import com.liang.blog.config.mongodb.DynamicCollectionEntity;
import com.liang.blog.util.MongoCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liang
 */
@Service
public class MgArticleService {

    public final ArticleRepository articleRepository;
    public final DynamicCollectionService dynamicCollectionService;

    @Autowired
    public MgArticleService(ArticleRepository articleRepository, DynamicCollectionService dynamicCollectionService) {
        this.articleRepository = articleRepository;
        this.dynamicCollectionService = dynamicCollectionService;
    }

    /**
     * 保存文章
     *
     * @param articleData 文章数据
     * @return ArticleData
     */
    public ArticleData saveArticle(ArticleData articleData) {
        DynamicCollectionEntity dynamicCollection = dynamicCollectionService.saveToDynamicCollection(MongoCollection.ARTICLE, articleData);
        System.out.println(dynamicCollection.getDataField());
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

}
