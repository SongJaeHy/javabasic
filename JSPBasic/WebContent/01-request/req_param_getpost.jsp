<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 폼에서 던진 데이터를 받기 위해서는 request.getParameter("name값")
	// 을 활용합니다.
	String id = request.getParameter("apple");
	String pw = request.getParameter("banana");
	String me = request.getParameter("melon");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title heress</title>
</head>
<body>
	아이디: <b><%= id %></b><br/>
	비밀번호: <b><%= pw %></b><br/>
	멜론:<b><%= me %></b>
</body>
</html>