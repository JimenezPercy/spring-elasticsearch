package com.seven.elk.elasticsearch.service.impl;

import com.seven.elk.elasticsearch.service.TestService;
import lombok.AllArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: wzp
 * @Date: 2020/10/25 11:56
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceImplTest {

    @Autowired
    private TestService testServiceImpl;

    @Test
    public void createIndex() {
        testServiceImpl.createIndex(Test.class);
    }

    @Test
    public void deleteIndex() {
        testServiceImpl.deleteIndex(Test.class);
    }

    @Test
    public void addDoc() {
        testServiceImpl.addDoc(new com.seven.elk.elasticsearch.entity.Test("2","3","5","6","7"));
    }
}