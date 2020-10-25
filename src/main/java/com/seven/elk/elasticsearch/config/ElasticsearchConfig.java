package com.seven.elk.elasticsearch.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

import java.time.Duration;

/**
 * @Author: wzp
 * @Date: 2020/10/25 10:50
 */
@Configuration
public class ElasticsearchConfig  extends AbstractElasticsearchConfiguration {


    @Override
    @Bean
    public RestHighLevelClient elasticsearchClient() {
        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo("192.168.94.132:9200")
                .build();

        return RestClients.create(clientConfiguration).rest();
    }


    @Bean
    public ElasticsearchRestTemplate elasticsearchRestTemplate() throws Exception {
        return new ElasticsearchRestTemplate(elasticsearchClient());
    }
}
