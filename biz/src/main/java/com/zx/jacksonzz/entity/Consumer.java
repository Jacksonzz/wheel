package com.zx.jacksonzz.entity;

import lombok.Data;

/**
 * @Name Consumer
 * @Description
 * @Date 2020/7/20 22:48
 * @Author Zhouzhi
 * @Version 1.0
 */
@Data
public class Consumer {
    /**
     * id
     */
    private Long id;
    /**
     * 用户名称
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 邮件
     */
    private String email;
    /**
     * 电话
     */
    private String phone;
}
