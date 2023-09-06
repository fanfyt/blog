package com.liang.blog.po;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 文章-标签-关联表
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@TableName("tag_relation")
public class TagRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 指标id
     */
    private Long tagId;

    /**
     * 文章id
     */
    private Long articleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    @Override
    public String toString() {
        return "TagRelation{" +
        "id = " + id +
        ", tagId = " + tagId +
        ", articleId = " + articleId +
        "}";
    }
}
