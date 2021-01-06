package com.zx.jacksonzz.base.service;

import com.zx.jacksonzz.base.utill.Result;

/**
 * @program: AbstractDealBaseService
 * @description: 对外提供接口用于处理内部选择不同服务
 * @author: zhou zhi
 * @create: 2021-01-06 10:59
 */
public interface DealBaseService {

    Result<Boolean> dealBase(String code, String msgId);
}
