package com.liang.blog.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 文件-文章关联表
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@TableName("file_article_relation")
public class FileArticleRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 文件id
     */
    private Long fileId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 文章id
     */
    private Long articleId;

    /**
     * 保存时间
     */
    private LocalDate saveTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public LocalDate getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(LocalDate saveTime) {
        this.saveTime = saveTime;
    }

    @Override
    public String toString() {
        return "FileArticleRelation{" +
                "id = " + id +
                ", fileId = " + fileId +
                ", userId = " + userId +
                ", articleId = " + articleId +
                ", saveTime = " + saveTime +
                "}";
    }
}
