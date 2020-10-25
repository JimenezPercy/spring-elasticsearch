package com.seven.elk.elasticsearch.service.impl;

import com.seven.elk.elasticsearch.entity.Test;
import com.seven.elk.elasticsearch.mapper.TestMapper;
import com.seven.elk.elasticsearch.service.TestService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author: wzp
 * @Date: 2020/10/25 11:53
 */
@Service
@Slf4j
@AllArgsConstructor
public class TestServiceImpl implements TestService {
    private ElasticsearchRestTemplate elasticsearchRestTemplate;
    private TestMapper mapper;
//    private ElasticsearchOperations elasticsearchOperations;

    @Override
    public void createIndex(Class<?> clazz) {
        log.info("开始创建索引{}", clazz);
        Object result = elasticsearchRestTemplate.createIndex(clazz);
        log.info("结果{}", result);
    }

    @Override
    public void deleteIndex(Class<?> clazz) {
        log.info("开始删除索引{}");
        Object result = elasticsearchRestTemplate.deleteIndex(clazz);
        log.info("结果{}", result);
    }

    @Override
    public void addDoc(Test t) {
        log.info("开始保存文档，{}",t);
        mapper.save(t);
    }
}
