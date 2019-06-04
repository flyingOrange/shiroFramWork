/*
Navicat MySQL Data Transfer

Source Server         : 本地数据库
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : shiro

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2019-06-04 16:36:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for permission_info
-- ----------------------------
DROP TABLE IF EXISTS `permission_info`;
CREATE TABLE `permission_info` (
  `perm_id` int(128) NOT NULL COMMENT '主键',
  `perm_code` varchar(255) NOT NULL COMMENT '权限码，用于分组展示',
  `perm_name` varchar(128) NOT NULL COMMENT '权限名称,用于展示',
  `create_time` bigint(20) NOT NULL COMMENT '创建时间',
  `upadte_time` bigint(20) NOT NULL COMMENT '更新时间',
  `premise` int(128) DEFAULT NULL,
  PRIMARY KEY (`perm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of permission_info
-- ----------------------------

-- ----------------------------
-- Table structure for role_info
-- ----------------------------
DROP TABLE IF EXISTS `role_info`;
CREATE TABLE `role_info` (
  `role_id` bigint(20) NOT NULL COMMENT '角色id',
  `role_name` varchar(256) NOT NULL COMMENT '角色名称',
  `status` tinyint(1) NOT NULL COMMENT '角色状态：0禁用、1启用',
  `create_time` bigint(20) NOT NULL,
  `update_time` bigint(20) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of role_info
-- ----------------------------
INSERT INTO `role_info` VALUES ('1', 'admin@iapppay.com', '1', '1459336942024', '1459336942024');
INSERT INTO `role_info` VALUES ('2', 'test@iapppay.com', '1', '1459336942024', '1459336942024');

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `role_id` bigint(20) NOT NULL COMMENT '角色id',
  `perm_id` varchar(128) NOT NULL COMMENT '权限code',
  `create_time` bigint(20) NOT NULL COMMENT '创建时间',
  `update_time` bigint(20) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`role_id`,`perm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限表';

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES ('1', 'ALL', '0', '0');
INSERT INTO `role_permission` VALUES ('2', 'upgrade:app:app:add', '0', '0');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `account_id` bigint(11) NOT NULL COMMENT '用户编号',
  `login_name` varchar(32) NOT NULL COMMENT '登录名',
  `login_pwd` varchar(32) NOT NULL COMMENT '密码',
  `account_name` varchar(32) NOT NULL COMMENT '用户名',
  `flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '密码存储更新标识',
  `salt` varchar(32) DEFAULT NULL COMMENT '密码加密的盐',
  `status` int(11) NOT NULL COMMENT '状态:0不可用,1可用',
  `create_time` bigint(20) NOT NULL COMMENT '创建时间',
  `update_time` bigint(20) NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`account_id`),
  UNIQUE KEY `uk_login_name` (`login_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统用户';

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', 'admin@iapppay.com', '52ef7afbfb08c270b40b28b095c6a65c', 'root', '1', 'bFfdTUeQ1Tdn5Ddex9MtUtfQtYZCZUkC', '1', '1435049252424', '1495017204023');
INSERT INTO `user_info` VALUES ('2', 'test@iapppay.com', '52ef7afbfb08c270b40b28b095c6a65c', 'test', '1', 'bFfdTUeQ1Tdn5Ddex9MtUtfQtYZCZUkC', '1', '1435049252424', '1495017204023');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `account_id` bigint(20) NOT NULL COMMENT '用户id',
  `role_id` bigint(20) NOT NULL COMMENT '角色ID',
  `create_time` bigint(20) NOT NULL COMMENT '创建时间',
  `update_time` bigint(20) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`account_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色表';

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1', '1435049252424', '1435049252424');
INSERT INTO `user_role` VALUES ('2', '2', '1435049252424', '1435049252424');
