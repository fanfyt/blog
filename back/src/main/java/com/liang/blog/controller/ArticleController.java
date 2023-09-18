package com.liang.blog.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liang.blog.config.sys.Result;
import com.liang.blog.model.ArticleModel;
import com.liang.blog.mongodb.ArticleData;
import com.liang.blog.po.Article;
import com.liang.blog.service.ArticleDoService;
import com.liang.blog.service.ArticleService;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Resource
    ArticleDoService articleDoService;
    @Resource
    ArticleService articleService;

    /**
     * 根据id查询文章
     *
     * @param id 文章id
     * @return Object
     */
    @GetMapping("/getArticleById/{id}")
    public Object getArticleById(@PathVariable Long id) {

        QueryWrapper<Article> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);

        return articleService.list(queryWrapper);
    }


    /**
     * 新增文章
     *
     * @param article 文章
     * @return Object
     */
    @PostMapping("add")
    public Result add(@RequestBody ArticleModel article) {

        return Result.sucess(articleDoService.saveArticleModel(article));
    }


    @Test
    public void test() {
        ArticleModel articleModel = new ArticleModel();
        LocalDate now = LocalDate.now();
        String format = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        byte b = 1;
        articleModel.setArticle(new Article(
                1L,
                1L,
                "TSET",
                now,
                now,
                now,
                b
        ));
        articleModel.setContent(new ArticleData(
                1L,
                "`LocalDate` 和 `Date` 是 Java 中处理日期的两种不同方式，它们之间存在一些重要的区别：\n" +
                        "\n" +
                        "1. `java.util.Date` 类：\n" +
                        "   - `Date` 类是 Java 早期日期和时间处理的类，存在自 Java 1.0 版本以来。\n" +
                        "   - 它是一个可变的类，因此在多线程环境下使用时需要进行同步处理。\n" +
                        "   - `Date` 类同时包含日期和时间信息，但不提供明确的方法来处理时区信息。\n" +
                        "   - 由于其可变性和不支持时区信息，它在许多情况下被认为是不安全的，已经被推荐使用其他日期和时间类代替。\n" +
                        "\n" +
                        "2. `java.time.LocalDate` 类：\n" +
                        "   - `LocalDate` 是 Java 8 引入的日期类，位于 `java.time` 包中，提供了更加强大和可靠的日期处理功能。\n" +
                        "   - `LocalDate` 是不可变的，线程安全的，因此更适合在多线程环境下使用。\n" +
                        "   - `LocalDate` 仅包含日期信息，不包含时间和时区信息，因此适用于处理纯日期，而不需要考虑时区和时刻。\n" +
                        "   - 若要处理时间和时区信息，还可以使用 `LocalTime` 和 `ZonedDateTime` 等类。\n" +
                        "\n" +
                        "下面是一个简单的示例，演示了如何使用 `LocalDate` 和 `Date`：\n" +
                        "\n" +
                        "使用 `LocalDate`：\n" +
                        "\n" +
                        "```java\n" +
                        "import java.time.LocalDate;\n" +
                        "\n" +
                        "public class LocalDateExample {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        LocalDate currentDate = LocalDate.now(); // 获取当前日期\n" +
                        "        System.out.println(\"当前日期: \" + currentDate);\n" +
                        "    }\n" +
                        "}\n" +
                        "```\n" +
                        "\n" +
                        "使用 `Date`：\n" +
                        "\n" +
                        "```java\n" +
                        "import java.util.Date;\n" +
                        "\n" +
                        "public class DateExample {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Date currentDate = new Date(); // 获取当前日期和时间\n" +
                        "        System.out.println(\"当前日期和时间: \" + currentDate);\n" +
                        "    }\n" +
                        "}\n" +
                        "```\n" +
                        "\n" +
                        "总的来说，如果你需要处理日期而不涉及时间和时区信息，推荐使用 `LocalDate`。如果需要处理时间和时区信息，可以使用 `java.time` 包中的其他类，如 `LocalDateTime` 或 `ZonedDateTime`。避免使用旧的 `Date` 类，因为它存在许多问题和限制。"
        ));
        articleModel.setContent(new ArticleData(
                1L,
                "`LocalDate` 和 `Date` 是 Java 中处理日期的两种不同方式，它们之间存在一些重要的区别：\n" +
                        "\n" +
                        "1. `java.util.Date` 类：\n" +
                        "   - `Date` 类是 Java 早期日期和时间处理的类，存在自 Java 1.0 版本以来。\n" +
                        "   - 它是一个可变的类，因此在多线程环境下使用时需要进行同步处理。\n" +
                        "   - `Date` 类同时包含日期和时间信息，但不提供明确的方法来处理时区信息。\n" +
                        "   - 由于其可变性和不支持时区信息，它在许多情况下被认为是不安全的，已经被推荐使用其他日期和时间类代替。\n" +
                        "\n" +
                        "2. `java.time.LocalDate` 类：\n" +
                        "   - `LocalDate` 是 Java 8 引入的日期类，位于 `java.time` 包中，提供了更加强大和可靠的日期处理功能。\n" +
                        "   - `LocalDate` 是不可变的，线程安全的，因此更适合在多线程环境下使用。\n" +
                        "   - `LocalDate` 仅包含日期信息，不包含时间和时区信息，因此适用于处理纯日期，而不需要考虑时区和时刻。\n" +
                        "   - 若要处理时间和时区信息，还可以使用 `LocalTime` 和 `ZonedDateTime` 等类。\n" +
                        "\n" +
                        "下面是一个简单的示例，演示了如何使用 `LocalDate` 和 `Date`：\n" +
                        "\n" +
                        "使用 `LocalDate`：\n" +
                        "\n" +
                        "```java\n" +
                        "import java.time.LocalDate;\n" +
                        "\n" +
                        "public class LocalDateExample {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        LocalDate currentDate = LocalDate.now(); // 获取当前日期\n" +
                        "        System.out.println(\"当前日期: \" + currentDate);\n" +
                        "    }\n" +
                        "}\n" +
                        "```\n" +
                        "\n" +
                        "使用 `Date`：\n" +
                        "\n" +
                        "```java\n" +
                        "import java.util.Date;\n" +
                        "\n" +
                        "public class DateExample {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Date currentDate = new Date(); // 获取当前日期和时间\n" +
                        "        System.out.println(\"当前日期和时间: \" + currentDate);\n" +
                        "    }\n" +
                        "}\n" +
                        "```\n" +
                        "\n" +
                        "总的来说，如果你需要处理日期而不涉及时间和时区信息，推荐使用 `LocalDate`。如果需要处理时间和时区信息，可以使用 `java.time` 包中的其他类，如 `LocalDateTime` 或 `ZonedDateTime`。避免使用旧的 `Date` 类，因为它存在许多问题和限制。"
        ));
        articleDoService.saveArticleModel(articleModel);
    }

}

