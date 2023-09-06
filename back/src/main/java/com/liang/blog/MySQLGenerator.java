package com.liang.blog;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;
import com.liang.blog.config.MyMapperCache;
import org.junit.Test;

/**
 * 通过数据库表生成实体类
 *
 * @author liang
 */
public class MySQLGenerator extends BaseGeneratorTest {

    /**
     * 数据源配置
     */
    private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder("jdbc:mariadb://localhost:3316/blog_system_v1?serverTimezone=Asia/Shanghai", "root", "root")
            .keyWordsHandler(new MySqlKeyWordsHandler())
            .build();

    @Test
    public void testSimple() {
        AutoGenerator generator = new AutoGenerator(DATA_SOURCE_CONFIG);
        generator.strategy(strategyConfig().build());

        // 包路径类名称设置
        generator.packageInfo(packageConfig()
                .parent("com.liang.blog")
                .entity("po")
                .service("service")
                .serviceImpl("service.impl")
                .xml("mapper.xml")
                .controller("controller")
                .build());

        // controller
//        generator.strategy(strategyConfig().controllerBuilder()
//                .enableRestStyle()
//                .superClass(BlogAbstractController.class)
//                .build());

        // mapper
        generator.strategy(strategyConfig().mapperBuilder()
                .superClass(BaseMapper.class)
                .enableBaseResultMap()
                .enableBaseColumnList()
                .cache(MyMapperCache.class)
                .formatMapperFileName("%sDao")
                .formatXmlFileName("%sXml")
                .build()
        );

        // service
        generator.strategy(strategyConfig().serviceBuilder()

                .build()
        );

        generator.global(globalConfig()
                .outputDir("\\")
                .author("fl").enableSpringdoc()
                .dateType(DateType.TIME_PACK)
                .commentDate("yyyy-MM-dd")
                .build());

        generator.execute();
    }
}
