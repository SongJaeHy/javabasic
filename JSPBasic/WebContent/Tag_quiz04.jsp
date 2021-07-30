<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! 
	// 선언부에 작성한 변수들은
	// 단 한 번만 선언됩니다.
	// 선언부에 작성한 변수들은 전역변수로 취급되어 외부 어디서건 호출이 가능합니다.
 	List<String> party = new ArrayList<>();
	String job;
%>
<%

	int same = (int)(Math.random()*5);
	switch(same){
	case 0:
		job = "전사";
		break;
	case 1:
		job = "도적";
		break;
	case 2:
		job = "궁수";
		break;
	case 3:
		job = "마법사";
		break;
	case 4:
		job = "사제";
		break;
}
party.add(job);

int cnt =0;
for(String player: party){
	if(job.equals(player)){
		cnt += 1;
	}
}
%>

<h2>당신의 역할</h2>
<p>
당신에게 부여된 역할은 <b>[<%= job %>]</b>입니다.<br>
햔재 파티에 당신과 같은 역할을 가진 플에지어는 <%= cnt %>입니다.
</p>

<p>
현재 파티 구성<br>
<%= party.toString() %>(<%=party.size() %>명 참가중)
</p>
<% 
	if(party.size()==10){
		party.clear();
	}
%>
</body>
</html>