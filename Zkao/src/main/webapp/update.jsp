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

	$(function(){
	
		var sid = ${param.sid};
		
		
	})
	
	

</script>

</head>
<body>

		编号： <input type="text" name="sid" id="sid"> <br>
		店铺名称： <input type="text" name="sname" id="sname"><br>
		创建日期： <input type="date" id="stime" ><br>
		销售商品：<input type="checkbox" value="2" name="pid" >IBM		
			  <input type="checkbox" value="1"  name="pid">华为手机
			  <input type="checkbox" value="3"  name="pid">苹果手机	
			  <input type="checkbox" value="4"  name="pid" >内存	<br>

</body>
</html>