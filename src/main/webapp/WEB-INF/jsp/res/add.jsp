<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
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
		<sf:form method="post" modelAttribute="res" id="addForm"
			action="/admin/res/add/">
			<table width="800" cellspacing="0" cellPadding="0">
				<thead>
					<tr>
						<td colspan="2">添加资源功能</td>
					</tr>
				</thead>
				<tr>
					<td class="rightTd" width="200px">res名称:</td>
					<td class="leftTd"><sf:input path="name" size="30" /></td>
				</tr>
				<tr>
					<td class="rightTd" width="200px">res地址:</td>
					<td class="leftTd"><sf:input path="url" size="30" /></td>
				</tr>
				<tr>
					<td class="rightTd">res权限字符串:</td>
					<td class="leftTd"><sf:input path="permission" size="30" /></td>
				</tr>
				<%-- <sf:input path="parent_id" />
				<sf:input path="parent_ids" />
			 --%>
				<tr>
					<td class="rightTd">资源类型:</td>
					<td class="leftTd"><sf:select path="type" size=""
							style="width:80px;height:25px">
							<sf:option value="menu"></sf:option>
							<sf:option value="button"></sf:option>
						</sf:select></td>
				</tr>

				<tr>
					<td colspan="2" class="centerTd"><input type="submit"
						value="添加菜单" /><input type="reset" /></td>
				</tr>
			</table>
		</sf:form>
	</div>
</body>
</html>