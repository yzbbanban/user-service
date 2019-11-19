package com.yzbbanban.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by brander on 2018/7/17
 */
@RefreshScope
@RestController
@RequestMapping("app")
public class TestZuulController {

    /**
     * 读取的配置文件
     */
    @Value("${from.user}")
    private String from;

    @GetMapping("get")
    public String getapp() {
        return this.from + "app";
    }
}
