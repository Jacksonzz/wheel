package com.zx.jacksonzz.controller;

import com.alibaba.fastjson.JSON;
import com.zx.jacksonzz.entity.Consumer;
import com.zx.jacksonzz.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Name ConsumerController
 * @Description
 * @Date 2020/7/20 23:15
 * @Author Zhouzhi
 * @Version 1.0
 */
@Slf4j
@Controller
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    ConsumerService consumerService;

    @RequestMapping(value = "/query" ,produces = "text/json;charset=UTF-8")
    @ResponseBody
    public String getConsumer(@RequestParam String username){
        Consumer consumer = new Consumer();
        consumer.setUsername(username);
        Consumer consumerInfo = consumerService.getConsumer(consumer);
        return JSON.toJSONString(consumerInfo);
    }
}
