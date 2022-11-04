<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<h1 style="color: red">Hi welcome to JSP Demo </h1>
<h2 style="color: blue">Just to check </h2>
			<%! 
			int a=100;
			int b=200;
			int res;
			%>
			<%
				res= a+b;
			%>
			Sum of A + B = <%=res%>
</body>
</html>

// add both servelt jar and JSP jar



				
