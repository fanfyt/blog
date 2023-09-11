package com.liang.blog.config.mongodb;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


public class LoadMongodbCollectionConfig {

    @Test
    public void test() {
        try {

            String property = System.getProperty("user.dir");
            System.out.println(property);

            File file = new File(property + "//src//main//resources//mongodb-collection-config.yml");
            InputStream stream = new FileInputStream(file);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
