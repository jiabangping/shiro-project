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
<title>Insert title here</title>
<base href=" <%=basePath%>">
</head>
<body>
	<jsp:include page="/jsp/common.jsp"></jsp:include>
	<div style="width:150px;display:inline-block">
	<c:forEach items="${reses }" var="res">
		<p>
			<a href="${res.url}" target="content">${res.name}</a>
		</p>
	</c:forEach>
	</div>
	<br />
</body>
</html>