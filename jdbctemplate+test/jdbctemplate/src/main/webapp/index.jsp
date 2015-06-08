<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World</title>
</head>
<body>
<a href="jsp/hello.jsp">hello</a>
<div align="center">
	<form action="login" method="post">
		用户名<input name="username" ><br>
		密&nbsp;码<input name="password" type="password"><br>
		<input type="submit" value="登录">
	</form>
</div>

</body>
</html>
