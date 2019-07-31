<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="${pageContext.request.contextPath}/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加学生信息页面</title>
</head>
<body>
	<form action="student/add" method="post">
		<table border="1px" cellpadding="0px" cellspacing="0px">
			<tr>
				<td>学生姓名:<input type="text" name="username" /></td>
				<td>密码:<input type="text" name="password" /></td>
				<td>学号:<input type="text" name="stunumber" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="添加" /></td>
			</tr>
		</table>
	</form>
</body>
</html>