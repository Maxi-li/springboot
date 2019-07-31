<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="${pageContext.request.contextPath}/">
<link rel="stylesheet" href="layui/css/layui.css" media="all"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="student/login" method="post">
		<table align="center" border="1px" cellpadding="0px" cellspacing="0px" width="260px" height="200px">
			<tr height="85px">
				<th colspan="2"><h2>用户登录</h2></th>
			</tr>
			<tr height="35px">
				<th>姓名：</th>
				<td align="center"><input type="text" name="username"></td>
			</tr>
			<tr height="35px">
				<th>密码：</th>
				<td align="center"><input type="password" name="password"></td>
			</tr>
			<tr height="50px">
				<td colspan="2" align="center"><input type="submit" value="登录" class="layui-btn layui-btn-radius layui-btn-sm"></td>
			</tr>
		</table>
		${msg}
	</form>
</body>
</html>