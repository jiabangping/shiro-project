<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<%
	String path = request.getContextPath();

	// 获得本项目的地址(例如: http://localhost:8080/MyApp/)赋值给basePath变量
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<span>
<shiro:authenticated>
	<shiro:hasPermission name="/admin/res/list">
	<a href="<%=request.getContextPath() %>/admin/res/list" class="admin_link">资源管理</a>
	</shiro:hasPermission>
	<shiro:hasPermission name="/admin/role/list">
	<a href="<%=request.getContextPath() %>/admin/role/list" class="admin_link">角色管理</a>
	</shiro:hasPermission>
	<shiro:hasPermission name="/admin/user/list">
	<a href="<%=request.getContextPath() %>/admin/user/list" class="admin_link">用户管理</a>
	</shiro:hasPermission>
	<a href="<%=basePath%>logout2">退出系统</a>
	欢迎 <shiro:principal property="nickname"/>使用我们的系统!
</shiro:authenticated>
<shiro:guest>
	<a href="<%=request.getContextPath() %>/login">登录系统</a>
</shiro:guest>
</span>
<hr/>