<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<script type="text/javascript">
	if (window.self == window.top) {
		//alert(222);
		//window.top.location = window.self.location;
	}
	if (window.self != window.top) {
		//alert(333);
		window.top.location = window.self.location;
	}
</script>
</head>
<body>
	<h2>${emsg }</h2>
	<form method="post" action="<%=basePath%>login">
		username:<input type="text" name="username" /><br /> password:<input
			type="password" name="password" /><br /> <input type="submit" />
	</form>
</body>
</html>