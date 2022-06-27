package com.daydayup.back;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class BackApplicationTests {

    @Test
    void contextLoads() {
        HashMap<StringBuffer, StringBuilder> map = new HashMap<>();
        map.put(new StringBuffer(123),new StringBuilder("12300"));

    }

}
