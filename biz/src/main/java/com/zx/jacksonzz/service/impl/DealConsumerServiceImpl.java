package com.zx.jacksonzz.service.impl;

import com.zx.jacksonzz.DealConsumerService;
import com.zx.jacksonzz.dao.ConsumerMapper;
import com.zx.jacksonzz.entity.Consumer;
import com.zx.jacksonzz.request.ConsumerRequest;
import com.zx.jacksonzz.response.ConsumerResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Name DealConsumerServiceImpl
 * @Description
 * @Date 2020/8/5 22:31
 * @Author Zhouzhi
 * @Version 1.0
 */
@Slf4j
@Service("dealConsumerService")
public class DealConsumerServiceImpl implements DealConsumerService {
    @Autowired
    ConsumerMapper consumerMapper;
    @Override
    public ConsumerResponse queryConsumerService(ConsumerRequest consumerRequest) {
        ConsumerResponse response = new ConsumerResponse();
        Consumer consumer = new Consumer();

        consumer.setUsername(consumerRequest.getUsername());
        log.info(consumer.getId()+"--------------------------------");
        Consumer info = consumerMapper.queryConsumerInfo(consumer);
        response.setUsername(info.getUsername());
        return response;
    }
}
