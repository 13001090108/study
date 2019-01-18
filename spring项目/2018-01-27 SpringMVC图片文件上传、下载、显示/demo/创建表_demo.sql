/*
Navicat MySQL Data Transfer

Source Server         : 本机连接
Source Server Version : 50548
Source Host           : 127.0.0.1:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50548
File Encoding         : 65001

Date: 2018-01-27 00:08:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) DEFAULT NULL,
  `user_tel` varchar(20) DEFAULT NULL,
  `user_password` varchar(50) DEFAULT NULL,
  `user_pic` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('10', 'lisi', '123', '123', '69303f90-e85d-47c8-9dc6-cf32bbbff4da.JPG');
INSERT INTO `t_user` VALUES ('11', 'zhangsan', '123', '123', 'e8aae686-4a67-4a93-babe-82d604eb7559.JPG');
INSERT INTO `t_user` VALUES ('12', 'wangwu', '123', '123', 'c07099c2-0a37-4fdf-b491-a1d12a9cc9f2.JPG');
