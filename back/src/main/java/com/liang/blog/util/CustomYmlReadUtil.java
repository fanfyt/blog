package com.liang.blog.util;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liang
 */
public class CustomYmlReadUtil {

    public static Map<String, Map<String, String>> getConfig(String fileName) {

        Map<String, Map<String, String>> configMap = new HashMap<>(16);
        Yaml yaml = new Yaml();
        try {

            String property = System.getProperty("user.dir");
            File file = new File(property + "//src//main//resources//" + fileName);
            InputStream inputStream = new FileInputStream(file);
            configMap = yaml.load(inputStream);
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return configMap;
    }

    public static Map<String, Map<String, String>> getMgCollection() {
        return getConfig("mongodb-collection-config.yml");
    }


}
