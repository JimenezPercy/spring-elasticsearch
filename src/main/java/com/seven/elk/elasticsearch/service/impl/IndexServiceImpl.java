package com.seven.elk.elasticsearch.service.impl;

import com.seven.elk.elasticsearch.service.IndexService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author: wzp
 * @Date: 2020/10/25 18:22
 */
@Service
@Slf4j
@AllArgsConstructor
public class IndexServiceImpl implements IndexService {
    private final ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Override
    public Boolean createIndex(Class<?> clazz) {
        log.info("开始创建索引{}", clazz);
        return elasticsearchRestTemplate.createIndex(clazz);
    }

    @Override
    public Boolean createIndex(String idxName) {
        log.info("开始创建索引{}", idxName);
        return elasticsearchRestTemplate.createIndex(idxName);
    }

    @Override
    public Boolean deleteIndex(Class<?> clazz) {
        log.info("开始删除索引{}",clazz);
        return elasticsearchRestTemplate.deleteIndex(clazz);
    }

    @Override
    public Boolean deleteIndex(String idxName) {
        log.info("开始删除索引{}", idxName);
        return elasticsearchRestTemplate.deleteIndex(idxName);
    }
}
