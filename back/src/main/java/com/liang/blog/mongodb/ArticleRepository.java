package com.liang.blog.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author liang
 */
public interface ArticleRepository extends MongoRepository<ArticleData, String> {

}
