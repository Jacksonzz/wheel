package com.zx.jacksonzz.base.service.impl;

import com.zx.jacksonzz.base.utill.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @program: DealMsgOneServiceImpl
 * @description: 不同service处理不同请求
 * @author: zhou zhi
 * @create: 2021-01-06 12:02
 */
@Slf4j
@Service("0001")
public class DealMsgOneServiceImpl extends AbstractBaseDealMsgService {
    @Override
    Result<Boolean> dealMsg(String code) {
        return null;
    }
}
