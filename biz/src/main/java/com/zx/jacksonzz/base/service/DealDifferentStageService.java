package com.zx.jacksonzz.base.service;

import com.zx.jacksonzz.base.utill.Result;

/**
 * @program: DealDifferentStageService
 * @description: 程序需要分阶段去执行，每个阶段处理不同事情
 * @author: zhou zhi
 * @create: 2021-01-06 17:20
 */
public interface DealDifferentStageService {
    Result<Boolean> dealStage(String code);
    void registerStageWorkService(int index,StageWorkService stageWorkService);
    StageWorkService[] getStageWorkService();
}
