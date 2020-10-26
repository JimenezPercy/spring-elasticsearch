package com.seven.elk.elasticsearch.service.impl;

import com.seven.elk.elasticsearch.service.IndexService;
import com.seven.elk.elasticsearch.util.IndexUtil;
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
    public boolean createIndex(Class<?> c) {
        //根据实体获取索引名称
        String indexName = IndexUtil.getIndexNameByEntity(c);

        log.info("===>开始创建索引{}，依据实体类{}", indexName, c);

        boolean flag = elasticsearchRestTemplate.createIndex(c);
        if (flag) {
            log.info("<===创建索引{}成功", indexName);
        } else {
            log.info("<===创建索引{}失败", indexName);
        }
        return flag;
    }

    @Override
    public boolean createIndex(String indexName) {
        log.info("===>开始创建索引{}", indexName);

        boolean flag = elasticsearchRestTemplate.createIndex(indexName);

        if (flag) {
            log.info("<===创建索引{}成功", indexName);
        } else {
            log.info("<===创建索引{}失败", indexName);
        }
        return flag;
    }

    @Override
    public boolean deleteIndex(Class<?> c) {
        //获取索引名称
        String indexName = IndexUtil.getIndexNameByEntity(c);
        log.info("===>开始删除索引{}，依据实体类{}", indexName, c);

        boolean flag = elasticsearchRestTemplate.deleteIndex(c);
        if (flag) {
            log.info("<===删除索引{}成功", indexName);
        } else {
            log.info("<===删除索引{}失败", indexName);
        }
        return flag;
    }

    @Override
    public boolean deleteIndex(String indexName) {
        log.info("===>开始删除索引{}", indexName);
        boolean flag = elasticsearchRestTemplate.deleteIndex(indexName);

        if (flag) {
            log.info("<===删除索引{}成功", indexName);
        } else {
            log.info("<===删除索引{}失败", indexName);
        }
        return flag;
    }

    @Override
    public boolean isIndexExists(Class<?> c) {
        //获取索引名称
        String indexName = IndexUtil.getIndexNameByEntity(c);
        log.info("===>正在检查索引{}是否存在，依据实体{}", indexName, c);

        boolean flag = elasticsearchRestTemplate.indexExists(c);
        if (flag) {
            log.info("<===索引{}存在", indexName);
        } else {
            log.info("<===索引{}不存在", indexName);
        }
        return flag;
    }

    @Override
    public boolean isIndexExists(String indexName) {
        log.info("===>正在检查索引{}是否存在", indexName);
        boolean flag = elasticsearchRestTemplate.indexExists(indexName);
        if (flag) {
            log.info("<===索引{}存在", indexName);
        } else {
            log.info("<===索引{}不存在", indexName);
        }
        return flag;
    }
}
