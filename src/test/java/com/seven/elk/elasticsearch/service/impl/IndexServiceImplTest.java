package com.seven.elk.elasticsearch.service.impl;

import com.seven.elk.elasticsearch.service.IndexService;
import com.seven.elk.elasticsearch.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author: wzp
 * @Date: 2020/10/25 18:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class IndexServiceImplTest {

    @Autowired
    private IndexService indexServiceImpl;

    @Test
    public void createIndex() {
        boolean flag=indexServiceImpl.createIndex("ttt");
        assertTrue(flag);
    }

    @Test
    public void testCreateIndex() {
    }

    @Test
    public void deleteIndex() {
        boolean flag=indexServiceImpl.deleteIndex(com.seven.elk.elasticsearch.entity.Test.class);
        assertTrue(flag);
    }

    @Test
    public void testDeleteIndex() {
        boolean flag=indexServiceImpl.deleteIndex("ttt");
        assertTrue(flag);
    }
}