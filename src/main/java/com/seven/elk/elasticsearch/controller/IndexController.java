package com.seven.elk.elasticsearch.controller;

import com.seven.elk.elasticsearch.service.IndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author wangzhipeng01
 * @date 2020-10-27 10:22
 */
@Api(tags = "索引")
@RestController
@RequestMapping("/index")
@AllArgsConstructor
@EnableSwagger2
public class IndexController {
    private final IndexService indexServiceImpl;

    /**
     * 创建索引
     * @param indexName 索引名称
     * @return
     */
    @ApiOperation(value = "创建索引")
    @PostMapping("/create/indexName")
    public Boolean createIndex(@PathVariable("indexName") String indexName) {
        return indexServiceImpl.createIndex(indexName);
    }

    /**
     * 删除索引
     * @param indexName 索引名称
     * @return
     */
    @ApiOperation(value = "删除索引")
    @DeleteMapping("/delete/indexName")
    public Boolean deleteIndex(@PathVariable("indexName") String indexName) {
        return indexServiceImpl.deleteIndex(indexName);
    }

    /**
     * 判断索引是否存在
     * @param indexName 索引名称
     * @return
     */
    @ApiOperation(value = "判断索引是否存在")
    @GetMapping("/exist/indexName")
    public Boolean isIndexExist(@PathVariable("indexName") String indexName) {
        return indexServiceImpl.isIndexExists(indexName);
    }

}
