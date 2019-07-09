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
		
		$("#sid").toggle(function(){
			$("[name='sid']").attr("checked",true)
		},function(){
			$("[name='sid']").attr("checked",false)
		})
		
	})
	
	
	function add(){
		location.href="add.jsp"
		
	}
	
	function toupdate(sid){
		location.href="update.jsp?sid="+sid;
	}
	
	function deleteall(){
		var ids = $("[name=sid]:checked").map(function(){
			return $(this).val();
		}).get().join(",")
		
		$.post("delall.do",{ids:ids},function(data){
			if(data > 0){
				alert("删除成功");
				location.href="list.do";
			}
		},"json")
		
		
	}
	
	

</script>
</head>
<body>

	<form action="list.do" method="post">
		<input type="text" name="sname"  id="sname">
		<input type="submit" value="搜索"  >
	</form>

	<table>
		<tr>
			<td>
				<input type="checkbox" id="sid">
			</td>
			<td>编号</td>
			<td>店铺名称</td>
			<td>创建日期</td>
			<td>销售商品</td>
			<td>
				<input type="button" value="添加" onclick="add()">	
				<input type="button" value="批量删除" onclick="deleteall()">	
				
			</td>
		</tr>
		
		<c:forEach items="${list }" var="s">
			 <tr>
			 	<td>
					<input type="checkbox" value="${s.sid }" name="sid">
				</td>
				<td>${s.sid }</td>
				<td>${s.sname }</td>
				<td>${s.stime }</td>
				<td>${s.pname }</td>
				<td>
					<input type="button" value="详细" onclick="toupdate('${s.sid }')"> 
				</td>
			</tr>
		
		</c:forEach>
	
	
	</table>


</body>
</html>