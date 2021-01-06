package com.zx.jacksonzz.base.service;

import com.zx.jacksonzz.base.utill.Result;

/**
 * @program: StageWorkService
 * @description:
 * @author: zhou zhi
 * @create: 2021-01-06 17:23
 */
public interface StageWorkService {
    /**
     *  一阶段
     * @param code
     * @return
     */
    Result<Boolean> oneStage(String code);

    /**
     *  二阶段
     * @param code
     * @return
     */
    Result<Boolean> twoStage(String code);

    /**
     * 三阶段
     * @param code
     * @return
     */
    Result<Boolean> threeStage(String code);
}
