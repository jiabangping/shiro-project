<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();

	// 获得本项目的地址(例如: http://localhost:8080/MyApp/)赋值给basePath变量
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div id="content">
		<h3 class="admin_link_bar">
			<jsp:include page="inc.jsp"></jsp:include>
		</h3>
		<table width="800" cellspacing="0" cellPadding="0" id="listTable"
			border="1">
			<thead>
				<tr>
					<td>资源标识</td>
					<td>名称</td>
					<td>URL</td>
					<td>权限字符串</td>
					<td>类型</td>
					<td>操作</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${reses }" var="res">
					<tr>
						<td>${res.id }</td>
						<td>${res.name}</td>
						<td>${res.url }</td>
						<td>${res.permission }&nbsp;</td>
						<c:choose>
							<c:when test="${res.type == 'menu' }">
								<td>菜单&nbsp;</td>
							</c:when>
							<c:otherwise>
								<td>按钮&nbsp;</td>
							</c:otherwise>
						</c:choose>
						<td><a href="update/${res.id }" class="list_op">更新</a> &nbsp;
							<a href="delete/${res.id }" class="list_op">删除</a> &nbsp; <c:if
								test="${res.type == 'menu'}"></c:if><a
							href="<%=basePath %>admin/res/add/${res.id }" class="list_op">添加child</a>
							&nbsp;</td>
						<!-- <td>
						</td> -->
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>