package com.liang.blog.controller;

import com.liang.blog.po.ArticleTag;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@Controller
@RequestMapping("/articleTag")
public class ArticleTagController {

    @Resource
    public Object setArticleTag(@RequestBody List<ArticleTag> tagList) {

        return null;
    }

}
