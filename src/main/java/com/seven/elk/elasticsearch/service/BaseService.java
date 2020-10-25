package com.seven.elk.elasticsearch.service;

/**
 * es操作公共接口
 * @Author: wzp
 * @Date: 2020/10/25 16:26
 */
public interface BaseService<T> {

    /**
     * 保存日志
     * @param t
     * @return
     */
    <S extends T>S save(T t);


}
