package com.hjj.hellospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hjj
 * @create 2020-03-07 17:59
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hell() {
        return "hello spring boot jiaqiang123";
    }
}
