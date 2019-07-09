<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">

	function out(){
		location.href="list.do";
	}
	
	function add(){
		
		$.post("addping.do",$("form").serialize(),function(data){
			if(data >0){
				alert("添加成功");
				location.href="list.do";
			}
		},"json")
	}
	

</script>
</head>
<body>


	<form >
	
		编号： <input type="text" name="sid"><br>
		店铺名称： <input type="text" name="sname"><br>
		创建日期： <input type="date" ><br>
		销售商品：<input type="checkbox" value="2" name="pid">IBM		
			  <input type="checkbox" value="1"  name="pid">华为手机
			  <input type="checkbox" value="3"  name="pid">苹果手机	
			  <input type="checkbox" value="4"  name="pid" >内存	<br>
		<input type="submit" value="保存" onclick="add()">  
		<input type="button" value="关闭" onclick="out()">  
	
	</form>



</body>
</html>