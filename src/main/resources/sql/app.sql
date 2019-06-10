CREATE DATABASE ssm-framework;
DROP TABLE IF EXISTS `sys_dict`;
CREATE TABLE `sys_dict`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) ,
  `name` varchar(255) ,
  `value` varchar(255) ,
  PRIMARY KEY (`id`) USING BTREE
) ;


-- 缓存
DROP TABLE IF EXISTS `cache`;
CREATE TABLE `cache`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) ,
  `desc` varchar(255) ,
  PRIMARY KEY (`id`) USING BTREE
);

INSERT INTO `cache` VALUES (1, 'java', 'java book');
INSERT INTO `cache` VALUES (2, 'c', 'c book');
INSERT INTO `cache` VALUES (3, 'life', 'lifebook');