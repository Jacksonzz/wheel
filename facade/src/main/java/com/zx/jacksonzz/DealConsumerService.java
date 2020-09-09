package com.zx.jacksonzz;

import com.zx.jacksonzz.request.ConsumerRequest;
import com.zx.jacksonzz.response.ConsumerResponse;

/**
 * @Name DealConsumerService
 * @Description
 * @Date 2020/8/5 22:18
 * @Author Zhouzhi
 * @Version 1.0
 */
public interface DealConsumerService {
    ConsumerResponse queryConsumerService(ConsumerRequest consumerRequest);
}
