package com.seven.elk.elasticsearch.service;

import com.seven.elk.elasticsearch.entity.Test;

/**
 * @Author: wzp
 * @Date: 2020/10/25 11:52
 */
public interface TestService {
    void createIndex(Class<?> clazz);
    void deleteIndex(Class<?> clazz);

    void addDoc(Test t);

}
