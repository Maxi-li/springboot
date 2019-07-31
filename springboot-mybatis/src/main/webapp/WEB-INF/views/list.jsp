<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="${pageContext.request.contextPath}/">
	<%--<%String path = request.getContextPath();
		String basePath =request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>--%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息展示页</title>
</head>
<body>
<table class="layui-table">
	<tr>
		<th>编号</th>
		<th>姓名</th>
		<th>密码</th>
		<th>学号</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${page.list}" var="student">
		<tr>
			<td>${student.id}</td>
			<td>${student.username}</td>
			<td>${student.password}</td>
			<td>${student.stunumber}</td>
			<td>
				<a href="student/toUpdate/${student.id}" class="layui-btn layui-btn-radius  layui-btn-sm">修改</a><a href="student/delete/${student.id}" class="layui-btn layui-btn-danger layui-btn-radius  layui-btn-sm">删除</a>
			</td>
		</tr>
	
	</c:forEach>
	<tr>
		<td colspan="5">
			<a href="student/toAdd" class="layui-btn layui-btn-normal layui-btn-radius  layui-btn-sm">添加</a>
		</td>
	</tr>
</table>
						<!-- 引入layui分页 -->
						<jsp:include page="page.jsp"/>
</body>
</html>