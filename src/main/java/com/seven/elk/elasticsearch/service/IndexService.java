package com.seven.elk.elasticsearch.service;

/**
 * @Author: wzp
 * @Date: 2020/10/25 18:22
 */
public interface IndexService {
    /**
     * 根据实体类创建索引
     * @param c
     */
    Boolean createIndex(Class<?> c);

    /**
     * 根据索引名称创建索引
     * @param idxName
     */
    Boolean createIndex(String idxName);

    /**
     * 根据实体类删除索引
     * @param c
     */
    Boolean deleteIndex(Class<?> c);

    /**
     * 根据实体名称删除索引
     * @param idxName
     */
    Boolean deleteIndex(String idxName);
}
