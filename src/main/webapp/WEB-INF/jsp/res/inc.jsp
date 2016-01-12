<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();

	// 获得本项目的地址(例如: http://localhost:8080/MyApp/)赋值给basePath变量
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%-- <jsp:include page="/jsp/common.jsp"></jsp:include> --%>
<span>
<a href="<%=basePath%>admin/res/add/0" class="admin_link">添加菜单</a><!-- 这里是添加菜单，menu在菜单上添加 -->
<%-- <a href="<%=request.getContextPath() %>/admin/res/list" class="admin_link">资源列表</a> --%>
</span>