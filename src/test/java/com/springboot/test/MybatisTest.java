package com.springboot.test;

import com.springboot.test.Mybatis.UserMapper;
import com.springboot.test.bean.User;
import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootStart.class)
public class MybatisTest {


    @Autowired
    public UserMapper userMapper;
    @Test
    public void testInsert() throws Exception {
        int num = userMapper.insert("zhangsan222", 20,"长沙","13100000000");
        TestCase.assertEquals(num,1);
    }
    @Test
    public void testFindById() throws Exception {
        User u = userMapper.findById("1");
        TestCase.assertNotNull(u);
        System.out.println(u.getName());
    }
}