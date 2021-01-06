package com.zx.jacksonzz.base.service.impl;

import com.zx.jacksonzz.base.service.DealDifferentStageService;
import com.zx.jacksonzz.base.service.StageWorkService;
import com.zx.jacksonzz.base.utill.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @program: DealDifferentStageServiceImpl
 * @description:
 * @author: zhou zhi
 * @create: 2021-01-06 17:28
 */
@Slf4j
@Service
public class DealDifferentStageServiceImpl implements DealDifferentStageService {
    @Value("initValue")
    int initValue;

    private StageWorkService[] stageWorkServices;


    @Override
    public Result<Boolean> dealStage(String code) {
        for (StageWorkService stageWorkService : stageWorkServices) {
            if (code.equals("1")) {
                stageWorkService.oneStage(code);
            } else if (code.equals("2")) {
                stageWorkService.twoStage("2");
            } else if (code.equals("3")) {
                stageWorkService.threeStage("3");
            }
        }
        return null;
    }

    @PostConstruct
    public void init() {
        stageWorkServices = new StageWorkService[initValue];
    }

    @Override
    public void registerStageWorkService(int index, StageWorkService stageWorkService) {
        stageWorkServices[index] = stageWorkService;
    }

    @Override
    public StageWorkService[] getStageWorkService() {
        return stageWorkServices;
    }
}
