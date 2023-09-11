package com.liang.blog.config.mongodb;

import org.springframework.data.annotation.Id;

/**
 * @author liang
 */
public class DynamicColumnEntity {

    @Id
    private String id;

    private String dynamicColumnName;  // 动态列名
    private String columnValue;        // 列值

    public DynamicColumnEntity() {
    }

    public DynamicColumnEntity(String id, String dynamicColumnName, String columnValue) {
        this.id = id;
        this.dynamicColumnName = dynamicColumnName;
        this.columnValue = columnValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDynamicColumnName() {
        return dynamicColumnName;
    }

    public void setDynamicColumnName(String dynamicColumnName) {
        this.dynamicColumnName = dynamicColumnName;
    }

    public String getColumnValue() {
        return columnValue;
    }

    public void setColumnValue(String columnValue) {
        this.columnValue = columnValue;
    }
}
