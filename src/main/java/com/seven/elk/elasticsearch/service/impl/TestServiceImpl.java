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

    private TestMapper mapper;
//    private ElasticsearchOperations elasticsearchOperations;



    @Override
    public Test save(Test t) {
        log.info("开始保存文档，{}",t);
        return mapper.save(t);
    }
}
