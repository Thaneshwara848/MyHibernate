
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Collect Demo </h2>
	<%
			ArrayList al= new ArrayList();
			al.add(100);
			al.add("Thanesh");
			al.add('A');
			al.add(true);
			out.print(al);
			Iterator i=al.iterator();
			while(i.hasNext())
			{
				out.print(i.next());
				out.print("<br>");
			}
	%>

</body>
</html>