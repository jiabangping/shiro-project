
此项目中实现的是直接通过 匹配url 来判断用户是否可以访问此url

其实也可以实现 一个url对应一个permission的功能张开涛的教程中 example-24中就是url-对应permission的方式

因为Shiro默认的WildcardPermission是匹配权限字符串的(如 user:delete)
可以

如果需要通过permission(user:update等)来匹配，需要让每个url对应 permission(权限字符串)
shiro.ini中首先设置 
securityManager.authorizer.permissionResolver = $urlPermissionResolver
权限决定者为自定义 (根据url来判断权限) 默认为使用 WildcardPermissionResolver

通过url的方式来控制
访问哪些资源需要哪些角色权限,不应该配置在shiro.ini文件中，这个是动态配置在数据库的
通过自己定义 filter resourceCheckFilter拦截器来实现
初始化数据
角色表
系统管理员 admin角色              拥有所有的权限
部门经理角色(depmgr)    拥有用户管理的权限
普通用户 (commonuser)  

我提交点东西
eclipse中使用git详细教程：http://p.primeton.com/articles/53ccec89e1382367e2000011 

fetch: http://www.cnblogs.com/yejiurui/archive/2013/07/29/3223153.html
 