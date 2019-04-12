package com.xin.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author xinguiyuan
 * @date 2019/4/12
 */
@RestController
public class HelloController {

    @Value("${person.lastName}")
    private String name;

    @RequestMapping("/hello")
    private String hello() {
        System.err.println("name:" + name);
        return "hello world";
    }
}
