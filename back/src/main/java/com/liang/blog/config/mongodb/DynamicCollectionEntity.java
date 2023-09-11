package com.liang.blog.config.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 动态选择保存到某个集合
 *
 * @author liang
 */
@Document
public class DynamicCollectionEntity {

    @Id
    private String id;

    private String dynamicCollectionName; // 动态集合名称
    private String dataField;

    public DynamicCollectionEntity() {
    }

    public DynamicCollectionEntity(String id, String dynamicCollectionName, String dataField) {
        this.id = id;
        this.dynamicCollectionName = dynamicCollectionName;
        this.dataField = dataField;
    }

    public String getDataField() {
        return dataField;
    }

    public void setDataField(String dataField) {
        this.dataField = dataField;
    }

    public String getDynamicCollectionName() {
        return dynamicCollectionName;
    }

    public void setDynamicCollectionName(String dynamicCollectionName) {
        this.dynamicCollectionName = dynamicCollectionName;
    }
}
