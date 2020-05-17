# ssmdemo
SSM+crud+分页+登录+上传文件

sql:
CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '',
  `age` tinyint(4) DEFAULT NULL,
  `born_date` date DEFAULT NULL,
  `head_img` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('12', '皑皑', '88', '2014-01-03', '');
INSERT INTO `t_user` VALUES ('16', '王五', '38', '1990-01-08', '');
INSERT INTO `t_user` VALUES ('26', '李小龙', '23', '1991-09-01', '');
INSERT INTO `t_user` VALUES ('27', '克里斯', '21', '1990-03-12', '');
INSERT INTO `t_user` VALUES ('34', 'admin', '36', '2020-04-04', null);
