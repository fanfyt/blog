package com.liang.blog.service;

import com.liang.blog.po.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@Service
public interface ArticleService extends IService<Article> {

    Object getList();
}
