<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 引入layui的css文件 -->
 <link rel="stylesheet" href="layui/css/layui.css" media="all"/>
 
 <!-- 引入layui的js文件 -->
<script src="layui/layui.js"></script>

	<script>
	layui.use('laypage', function(){
	  var laypage = layui.laypage;
	  
	  //执行一个laypage实例
	  laypage.render({
	    elem: 'page', //注意，这里的 test1 是 ID，不用加 # 号
	    count: ${page.totalCount}, //数据总数，从服务端得到
	    limit:${page.pageSize},//每页显示的条数,从服务端得到
	    limits:[1,2,3,4,5],//可以选择每页显示的条数  
	    curr:${page.currentPage}, //当前页,从服务端得到
	    groups:5,//连续展示的页面个数
	    layout:['count','prev','page','next','limit','refresh','skip'],
	    jump: function(obj, first){
	    	//点击页码或上一页下一页时触发的方法,在此方法中发送请求去查询分页数据
	        //obj包含了当前分页的所有参数，比如：
	        console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
	        console.log(obj.limit); //得到每页显示的条数
	        
	        //首次不执行
	        if(!first){
	        //发送请求去查询分页的数据
	         location.href="${page.url}?currentPage="+obj.curr+"&pageSize="+obj.limit;
	        }
	      }
	  });
	});
	</script>
</head>
<body>
		<!-- 放分页导航条的地方 -->
		<div id="page"></div>
</body>
</html>