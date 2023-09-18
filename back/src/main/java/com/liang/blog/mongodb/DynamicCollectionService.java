package com.liang.blog.mongodb;

import com.liang.blog.config.mongodb.DynamicCollectionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * 动态指定mongodb集合与列名称
 *
 * @author liang
 */

@Service
public class DynamicCollectionService {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public DynamicCollectionService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    /**
     * 保存到指定集合
     *
     * @param collectionName 集合
     * @param dataField      列名称
     */
    public DynamicCollectionEntity saveToDynamicCollection(String collectionName, Object dataField) {
        DynamicCollectionEntity entity = new DynamicCollectionEntity();
        entity.setDynamicCollectionName(collectionName);
        entity.setDynamicCollectionName("shazi");
        entity.setDataField(String.valueOf(dataField));


        // 使用动态集合名称保存文档
        return mongoTemplate.save(entity, collectionName);


    }

    public void insert(Object obj) {
        mongoTemplate.insert(obj);

    }
}
