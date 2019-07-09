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
</head>
<body>


<table>
	<tr>
		<td>编号</td>
		<td>姓名</td>
		<td>性别</td>
		<td>层级</td>
	</tr>
	<c:forEach items="${list }" var="e">
		<tr>
			<td>${e.eid }</td>
			<td>${e.ename }</td>
			<td>${e.sex }</td>
			<td>${e.did }</td>
		</tr>
	
	</c:forEach>

</table>

</body>
</html>