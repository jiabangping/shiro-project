<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
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
<title>Insert title here</title>
<base href=" <%=basePath%>">
<link rel="stylesheet"
	href="<%=basePath%>/resources/css/layout-default-latest.css">
</head>
<script type="text/javascript">
	//下面的if语句首先执行
	if (window.self == window.top) {
		//alert(222);
		//window.top.location = window.self.location;
	}
	if (window.self != window.top) {
		//alert(333);
		window.top.location = window.self.location;
	}
</script>
<body>

	<h3>shiro的测试项目</h3>
	<%-- <jsp:include page="menu.jsp"></jsp:include> --%>
	<div style="width: 1100px; margin: 0 auto">
		<div style="width: 10%; display: inline-block; float: left">
			<c:forEach items="${reses }" var="res">
				<c:if test="${res.type == 'menu' }">
					<shiro:hasPermission name="${res.url}">
						<p>
							<a href="<%=basePath %>${res.url}" target="content">${res.name}</a>
						</p>
					</shiro:hasPermission>
				</c:if>
			</c:forEach>
		</div>
		<div style="width: 90%; float: right">
			<iframe name="content" width="1000px" height="800px" scrolling="no"
				frameborder="0" src="<%=basePath%>admin/user/list"></iframe>
		</div>
	</div>
	<script src="<%=basePath%>/resources/jquery-1.11.3.min.js"></script>
	<script src="<%=basePath%>/resources/jquery.layout-latest.min.js"></script>

	<!-- <script>
		$(function() {
			$(document).ready(function() {
				alert(11);
				$('body').layout({
					applyDemoStyles : true
				});
			});
		});
	</script> -->
</body>
</html>
