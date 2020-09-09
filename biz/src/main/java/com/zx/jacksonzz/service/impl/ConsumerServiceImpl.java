package com.zx.jacksonzz.service.impl;

import com.zx.jacksonzz.dao.ConsumerMapper;
import com.zx.jacksonzz.entity.Consumer;
import com.zx.jacksonzz.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Name ConsumerServiceImpl
 * @Description
 * @Date 2020/7/20 22:54
 * @Author Zhouzhi
 * @Version 1.0
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Autowired
    ConsumerMapper consumerMapper;

    @Override
    public Consumer getConsumer(Consumer consumer) {

        return consumerMapper.queryConsumerInfo(consumer);
    }
}
