<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	for(int i =2; i <=9; i++) {
		if(i%2 != 0){
	 	out.println("<h2>구구단" + i + "단</h2><hr/>");
		for(int hang=1; hang<=9; hang++){
		out.println(i + " * " + hang+ " =" + (i * hang) + "<br/>");
		}
		out.println("<br/>");
	}
}
 %>
</body>
</html>