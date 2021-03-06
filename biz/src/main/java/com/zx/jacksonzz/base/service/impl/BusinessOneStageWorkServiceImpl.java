package com.zx.jacksonzz.base.service.impl;

import com.zx.jacksonzz.base.service.DealDifferentStageService;
import com.zx.jacksonzz.base.service.StageWorkService;
import com.zx.jacksonzz.base.utill.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @program: BusinessOneStageWorkServiceImpl
 * @description:
 * @author: zhou zhi
 * @create: 2021-01-06 17:43
 */
@Slf4j
@Service
public class BusinessOneStageWorkServiceImpl implements StageWorkService {
    @Autowired
    DealDifferentStageService dealDifferentStageService;

    @PostConstruct
    public void init() {
        dealDifferentStageService.registerStageWorkService(0,this);
    }


    @Override
    public Result<Boolean> oneStage(String code) {
        return null;
    }

    @Override
    public Result<Boolean> twoStage(String code) {
        return null;
    }

    @Override
    public Result<Boolean> threeStage(String code) {
        return null;
    }
}
