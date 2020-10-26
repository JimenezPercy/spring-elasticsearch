package com.seven.elk.elasticsearch.service;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

import java.io.IOException;

/**
 * @Author: wzp
 * @Date: 2020/10/26 21:46
 */
@Slf4j
public class ReloadPrometheus implements CommandLineRunner {
//    @Value("${mse.prometheus.server-addr}")
    private String url;

    @Override
    public void run(String... args) throws Exception {
        String cmd = "wget --post-data \"\" " + url + "/-/reload";
        try {
            Runtime.getRuntime().exec(cmd);
            log.info("ReloadPrometheus Success---cmd:" + cmd);
        } catch (IOException e) {
            log.error("ReloadPrometheus Fail---cmd:" + cmd);
        }
    }
}