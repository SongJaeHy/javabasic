<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>화씨 온도 계산기</title>
</head>
<body>
	<%! public double Celcius = 33;
		double CtoF(double n1){
			return (1.8*n1)+32;
		}
	
	%>
	<% 
		out.println("<h2> 오늘 현재 홍대입구의 온도 </h2>");
		out.println("섭씨 온도 : " + Celcius + "<br/>");
	    out.println("화씨 온도 : " + CtoF(Celcius));%>
</body>
</html>