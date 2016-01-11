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
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

-- 正在导出表  shiro_project.t_resource 的数据：~14 rows (大约)
/*!40000 ALTER TABLE `t_resource` DISABLE KEYS */;
INSERT INTO `t_resource` (`id`, `name`, `permission`, `url`, `parent_id`, `parent_ids`, `type`) VALUES
	(1, '用户管理', NULL, '/admin/user/list', 0, '0/', 'menu'),
	(2, '资源管理', NULL, '/admin/res/list', 0, '0/', 'menu'),
	(3, '角色管理', NULL, '/admin/role/list', 0, '0/', 'menu'),
	(4, '添加用户', NULL, '/admin/user/add*', 1, '0/1/', 'button'),
	(5, '删除用户', NULL, '/admin/user/delete/*', 1, '0/1/', 'button'),
	(6, '更新用户', NULL, '/admin/user/update/*', 1, '0/1/', 'button'),
	(7, '设置用户角色', NULL, '/admin/user/setUserRole/*', 1, '0/1/', 'button'),
	(8, '添加资源', NULL, '/admin/res/add*', 2, '0/2/', 'button'),
	(9, '删除资源', NULL, '/admin/res/delete/*', 2, '0/2/', 'button'),
	(10, '修改资源', NULL, '/admin/res/update/*', 2, '0/2/', 'button'),
	(11, '添加角色', NULL, '/admin/role/add*', 3, '0/3/', 'button'),
	(12, '删除角色', NULL, '/admin/role/delete/*', 3, '0/3/', 'button'),
	(13, '修改角色', NULL, '/admin/role/update/*', 3, '0/3/', 'button'),
	(14, '设置角色资源', NULL, '/admin/role/setRolePermission/*', 3, '0/3/', 'button'),
	(15, '资源菜单页', NULL, '/admin/res/index', 2, '0/3/', 'button'),
	(16, '快递管理', '', '/admin/express/list', 0, '0/', 'menu'),
	(17, '查询用户权限', NULL, '/admin/user/listRes/*', 1, '0/1/', 'button'),
	(18, '设置角色权限(资源)', '', '/admin/role/setRes/*', 0, '0/3/', 'button'),
	(19, '查看角色权限(资源)', '', '/admin/role/listRes/*', 0, '0/3/', 'button');
/*!40000 ALTER TABLE `t_resource` ENABLE KEYS */;


-- 导出  表 shiro_project.t_role 结构
CREATE TABLE IF NOT EXISTS `t_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sn` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

-- 正在导出表  shiro_project.t_role 的数据：~0 rows (大约)
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
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

-- 正在导出表  shiro_project.t_role_res 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `t_role_res` DISABLE KEYS */;
INSERT INTO `t_role_res` (`id`, `res_id`, `role_id`) VALUES
	(1, 1, 1),
	(2, 2, 1),
	(3, 3, 1),
	(4, 4, 1),
	(5, 5, 1),
	(6, 6, 1),
	(7, 7, 1),
	(8, 8, 1),
	(9, 9, 1),
	(10, 10, 1),
	(11, 11, 1),
	(12, 12, 1),
	(13, 13, 1),
	(14, 14, 1),
	(15, 15, 1),
	(16, 2, 2),
	(17, 3, 2),
	(18, 4, 2),
	(19, 5, 2),
	(20, 6, 2),
	(21, 7, 2),
	(22, 17, 1),
	(23, 18, 1),
	(24, 19, 1),
	(25, 15, 2),
	(26, 15, 3);
/*!40000 ALTER TABLE `t_role_res` ENABLE KEYS */;


-- 导出  表 shiro_project.t_user 结构
CREATE TABLE IF NOT EXISTS `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `status` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

-- 正在导出表  shiro_project.t_user_role 的数据：~0 rows (大约)
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
