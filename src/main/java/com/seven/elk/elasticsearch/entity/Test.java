package com.seven.elk.elasticsearch.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @Author: wzp
 * @Date: 2020/10/24 22:14
 */
@Document(indexName = "test",shards=5)
@Data
@NoArgsConstructor
public class Test {
    /**
     * 唯一标识
     */
    @Id
    private String id;

    /**
     * 日志标题
     */
    @Field(type = FieldType.Text)
    private String title;

    /**
     * 日志类型
     */
    @Field(type = FieldType.Keyword)
    private String category;

    /**
     * 用户
     */
    @Field(type = FieldType.Keyword)
    private String user;

    /**
     * 时间
     */
    @Field(type = FieldType.Date, format = DateFormat.basic_date_time)
    private String dateTime;

    /**
     * 日志源位置
     */
    @Field(type = FieldType.Text)
    private String position;

    /**
     * 日志详情
     */
    @Field(index = false, type = FieldType.Text)
    private String detail;

    public Test(String title, String category, String user, String position, String detail) {
        this.title = title;
        this.category = category;
        this.user = user;
        this.dateTime = dateTime;
        this.position = position;
        this.detail = detail;
    }
}
