<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> Hi Welcome to JSP </h1>
	<%! int a=10;int b=20; %>
	<% int  c= a+b; %>
	The Sum of A+ B is  : <%=c  %>
</body>
</html>


