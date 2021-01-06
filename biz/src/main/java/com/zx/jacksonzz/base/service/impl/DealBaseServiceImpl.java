package com.zx.jacksonzz.base.service.impl;

import com.zx.jacksonzz.base.service.DealBaseService;
import com.zx.jacksonzz.base.utill.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @program: DealBaseServiceImpl
 * @description: 对外提供接口用于处理内部选择不同服务
 * @author: zhou zhi
 * @create: 2021-01-06 11:23
 */
@Slf4j
public class DealBaseServiceImpl implements DealBaseService, ApplicationContextAware {
    private ApplicationContext applicationContext;


    @Override
    public Result<Boolean> dealBase(String code, String msgId) {
        Result<Boolean> result = new Result<>();
        if (applicationContext.containsBean(msgId)) {
            AbstractBaseDealMsgService abstractBaseDealMsgService = (AbstractBaseDealMsgService) applicationContext.getBean(msgId);
            result = abstractBaseDealMsgService.dealMsg(code);
        } else {
            result.setErrorCode("error");
            result.setErrorMsg("未发现类");
        }
        return result;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
