package com.demo.lego;

import com.demo.lego.ServiceImpl.eatServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * @version 1.0
 * @Author Ethan
 * @Date 2020/10/25 21:36 Create
 */

@SpringBootTest(classes = LegoApplication.class)
public class TestEatServiceImpl extends AbstractTestNGSpringContextTests {
    @Autowired
    public eatServiceImpl imp;
    @Test
    private void test(){
        System.out.println(imp.eatService());
        System.out.println("testng成功调用");
    }
}
