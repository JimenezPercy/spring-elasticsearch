package com.seven.elk.elasticsearch.mapper;

import com.seven.elk.elasticsearch.entity.Test;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: wzp
 * @Date: 2020/10/25 11:51
 */
@Repository
public interface TestMapper extends ElasticsearchRepository<Test,String> {
}
