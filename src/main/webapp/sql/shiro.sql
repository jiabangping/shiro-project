-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.6.24 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win32
-- HeidiSQL 版本:                  8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 shiro_project 的数据库结构
CREATE DATABASE IF NOT EXISTS `shiro_project` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `shiro_project`;


-- 导出  表 shiro_project.t_resource 结构
CREATE TABLE IF NOT EXISTS `t_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `permission` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `parent_id` int(11) NOT NULL,
  `parent_ids` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10024 DEFAULT CHARSET=utf8;

-- 正在导出表  shiro_project.t_resource 的数据：~19 rows (大约)
/*!40000 ALTER TABLE `t_resource` DISABLE KEYS */;
INSERT INTO `t_resource` (`id`, `name`, `permission`, `url`, `parent_id`, `parent_ids`, `type`) VALUES
	(10001, '用户管理', NULL, '/admin/user/list', 0, '0/', 'menu'),
	(10002, '资源管理', NULL, '/admin/res/list', 0, '0/', 'menu'),
	(10003, '角色管理', NULL, '/admin/role/list', 0, '0/', 'menu'),
	(10004, '添加用户', NULL, '/admin/user/add*', 1, '0/10001/', 'button'),
	(10005, '删除用户', NULL, '/admin/user/delete/*', 1, '0/10001/', 'button'),
	(10006, '更新用户', NULL, '/admin/user/update/*', 1, '0/10001/', 'button'),
	(10007, '设置用户角色', NULL, '/admin/user/setUserRole/*', 1, '0/10001/', 'button'),
	(10008, '添加资源', NULL, '/admin/res/add/*', 2, '0/10002/', 'button'),
	(10009, '删除资源', NULL, '/admin/res/delete/*', 2, '0/10002/', 'button'),
	(10010, '修改资源', NULL, '/admin/res/update/*', 2, '0/10002/', 'button'),
	(10011, '添加角色', NULL, '/admin/role/add*', 3, '0/10003/', 'button'),
	(10012, '删除角色', NULL, '/admin/role/delete/*', 3, '0/10003/', 'button'),
	(10013, '修改角色', NULL, '/admin/role/update/*', 3, '0/10003/', 'button'),
	(10014, '设置角色资源', NULL, '/admin/role/setRolePermission/*', 3, '0/10003/', 'button'),
	(10015, '资源菜单页', NULL, '/admin/res/index', 2, '0/10003/', 'button'),
	(10016, '快递管理', '', '/admin/express/list', 0, '0/', 'menu'),
	(10017, '查询用户权限', NULL, '/admin/user/listRes/*', 1, '0/10001/', 'button'),
	(10018, '设置角色权限(资源)', '', '/admin/role/setRes*', 0, '0/10003/', 'button'),
	(10019, '查看角色权限(资源)', '', '/admin/role/listRes/*', 0, '0/10003/', 'button');
/*!40000 ALTER TABLE `t_resource` ENABLE KEYS */;


-- 导出  表 shiro_project.t_role 结构
CREATE TABLE IF NOT EXISTS `t_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sn` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- 正在导出表  shiro_project.t_role 的数据：~3 rows (大约)
/*!40000 ALTER TABLE `t_role` DISABLE KEYS */;
INSERT INTO `t_role` (`id`, `name`, `sn`) VALUES
	(1, '系统管理员', 'admin'),
	(2, '经理', 'jingli'),
	(3, '普通用户', 'commonuser');
/*!40000 ALTER TABLE `t_role` ENABLE KEYS */;


-- 导出  表 shiro_project.t_role_res 结构
CREATE TABLE IF NOT EXISTS `t_role_res` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `res_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- 正在导出表  shiro_project.t_role_res 的数据：~26 rows (大约)
/*!40000 ALTER TABLE `t_role_res` DISABLE KEYS */;
INSERT INTO `t_role_res` (`id`, `res_id`, `role_id`) VALUES
	(1, 10001, 1),
	(2, 10002, 1),
	(3, 10003, 1),
	(4, 10004, 1),
	(5, 10005, 1),
	(6, 10006, 1),
	(7, 10007, 1),
	(8, 10008, 1),
	(9, 10009, 1),
	(10, 10010, 1),
	(11, 10011, 1),
	(12, 10012, 1),
	(13, 10013, 1),
	(14, 10014, 1),
	(15, 10015, 1),
	(16, 10002, 2),
	(17, 10003, 2),
	(18, 10004, 2),
	(19, 10005, 2),
	(20, 10006, 2),
	(21, 10007, 2),
	(22, 10017, 1),
	(23, 10018, 1),
	(24, 10019, 1),
	(25, 10015, 2),
	(29, 10016, 1);
/*!40000 ALTER TABLE `t_role_res` ENABLE KEYS */;


-- 导出  表 shiro_project.t_user 结构
CREATE TABLE IF NOT EXISTS `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `status` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- 正在导出表  shiro_project.t_user 的数据：~3 rows (大约)
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` (`id`, `nickname`, `password`, `status`, `username`) VALUES
	(1, '系统管理员', 'bbad8d72c1fac1d081727158807a8798', 1, 'admin'),
	(2, '张三', 'e7a6d0f97db7ea1c4a0c1c137cbf771c', 1, 'zhangsan'),
	(3, '李四', '930e4d94d11ca3b261b02765b8ba88da', 1, 'lisi');
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;


-- 导出  表 shiro_project.t_user_role 结构
CREATE TABLE IF NOT EXISTS `t_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- 正在导出表  shiro_project.t_user_role 的数据：~4 rows (大约)
/*!40000 ALTER TABLE `t_user_role` DISABLE KEYS */;
INSERT INTO `t_user_role` (`id`, `role_id`, `user_id`) VALUES
	(1, 1, 1),
	(2, 2, 2),
	(3, 2, 3),
	(4, 3, 3);
/*!40000 ALTER TABLE `t_user_role` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
