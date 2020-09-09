package com.zx.jacksonzz.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Name Consumer
 * @Description
 * @Date 2020/8/5 22:15
 * @Author Zhouzhi
 * @Version 1.0
 */
@Data
public class ConsumerRequest implements Serializable {
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
