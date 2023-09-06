package com.liang.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liang.blog.po.Article;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@Service
public interface ArticleService extends IService<Article> {

    Object getList();
}
