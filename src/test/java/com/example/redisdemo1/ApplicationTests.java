package com.example.redisdemo1;

import com.example.redisdemo1.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void contextLoads() {
    }

    /**
     * string存储测试
     */
    @Test
    public void setTest(){
        redisUtil.set("age","24",0);
    }

    /**
     * string获取key测试
     */
    @Test
    public void getTest(){
        String age = redisUtil.get("age",0);
        System.out.println("age: "+age);
    }
}
