package com.seven.elk.elasticsearch.service;

/**
 * @Author: wzp
 * @Date: 2020/10/25 18:22
 */
public interface IndexService {
    /**
     * 根据实体类创建索引
     * @param c 实体类
     * @return
     */
    boolean createIndex(Class<?> c);

    /**
     * 根据实体类创建索引
     * @param s 索引名称
     * @return
     */
    boolean createIndex(String s);

    /**
     * 根据实体类删除索引
     * @param c 实体类
     * @return
     */
    boolean deleteIndex(Class<?> c);

    /**
     * 根据索引名称删除索引
     * @param s 索引名称
     * @return
     */
    boolean deleteIndex(String s);

    /**
     * 根据实体类判断索引是否存在
     * @param c 实体类
     * @return
     */
    boolean isIndexExists(Class<?> c);

    /**
     * 根据索引名称判断索引是否存在
     * @param s 索引名称
     * @return
     */
    boolean isIndexExists(String s);
}
