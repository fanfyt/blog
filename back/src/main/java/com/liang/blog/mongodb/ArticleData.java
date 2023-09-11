package com.liang.blog.mongodb;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 文章数据内容
 *
 * @author liang
 */
@Document(collection = "mycollection")
public class ArticleData {


    /**
     * 文章id
     */
    private Long id;

    /**
     * 文章内容
     */
    private String content;

    public ArticleData() {
    }

    public ArticleData(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleData{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
