package com.seven.elk.elasticsearch.util;

import org.springframework.data.elasticsearch.annotations.Document;

import java.lang.annotation.Annotation;

/**
 * 索引操作工具类
 *
 * @author wangzhipeng01
 * @date 2020-10-26 19:22
 */
public class IndexUtil {
    /**
     * 根据实体类获取索引名称
     *
     * @param c 实体类
     * @return 索引名称
     */
    public static String getIndexNameByEntity(Class<?> c) {
        String indexName = null;
        Annotation[] s = c.getAnnotations();
        for (Annotation q : s) {
            if (q instanceof Document) {
                indexName = ((Document) q).indexName();
            }
        }
        return indexName;
    }
}
