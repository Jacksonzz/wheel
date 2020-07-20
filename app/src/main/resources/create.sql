-- 创建数据库
DROP DATABASE xiaomi;
CREATE DATABASE xiaomi DEFAULT CHARSET 'utf8';
USE xiaomi;

-- ----------------------------- 创建数据表
-- 用户
CREATE TABLE `consumer` (
                            `id` INT AUTO_INCREMENT PRIMARY KEY COMMENT '用户编号',
                            `username` VARCHAR(50) NOT NULL COMMENT '用户账号',
                            `password` VARCHAR(50) NOT NULL COMMENT '用户密码',
                            `email` VARCHAR(50) DEFAULT '待完善' COMMENT '电子邮箱',
                            `phone` VARCHAR(20) DEFAULT '待完善' COMMENT '联系方式'
);
