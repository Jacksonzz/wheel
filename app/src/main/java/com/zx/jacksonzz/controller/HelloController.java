package com.zx.jacksonzz.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Name HelloController
 * @Description
 * @Date 2020/7/10 1:04
 * @Author Zhouzhi
 * @Version 1.0
 */
@Slf4j
@Controller
@RequestMapping("/index")
public class HelloController {
    @RequestMapping("/say")
    public void hello() {
        log.info("hello world");
    }

}
