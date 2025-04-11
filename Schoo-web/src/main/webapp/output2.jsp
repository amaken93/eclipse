<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="calc.css">
</head>
<body>
	<h1>計算結果</h1>
	<%
	if (request.getAttribute("msg") == null) {
	%>
	<p>
		計算結果は<%=request.getAttribute("calc")%>です
	</p>
	<%
	} else {
	%>

	<p class="error"><%=request.getAttribute("msg")%></p>
	<%
	}
	%>
	<br>
	<a href="input2.html">戻る</a>
</body>
</html>