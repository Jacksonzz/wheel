package com.zx.jacksonzz.base.service.impl;

import com.zx.jacksonzz.base.utill.Result;

/**
 * @program: AbstractBaseDealMsgService
 * @description:
 * @author: zhou zhi
 * @create: 2021-01-06 11:57
 */

public abstract class AbstractBaseDealMsgService {
    abstract Result<Boolean> dealMsg(String code);
}
