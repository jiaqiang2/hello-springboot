package com.hjj.hellospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hjj
 * @create 2020-03-07 19:07
 */
@RestController
public class TestController {
    @RequestMapping("/a")
    public String test1() {
        return "test a";
    }

    @RequestMapping("/b")
    public String test2() {
        return "test b";
    }
}
