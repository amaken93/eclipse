<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>現在時刻の表示結果</h1>
現在の日付：<%=request.getAttribute("ndate") %><br>
<input type="hidden" id="ndate" value="<%=request.getAttribute("ndate") %>">
現在の時刻：<span id="realtime"></span><br>
<input type="hidden" id="ntime" value="<%=request.getAttribute("ntime") %>">
1時間後の時刻：<%=request.getAttribute("ftime") %>
<input type="hidden" id="ftime" value="<%=request.getAttribute("ftime") %>">
<h3>カウントダウン：</h3>
<span id = "timer"></span>

<script src="realtime.js"></script>
</body>
</html>