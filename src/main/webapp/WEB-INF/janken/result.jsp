<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="janken.model.JankenBean"%>
<%
JankenBean janken = (JankenBean) request.getAttribute("janken");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>janken app</title>
</head>
<body>
	<h1>
		じゃんけんの結果は<%=janken.jankenResult%></h1>
	<ul>
		<li>あなたの手は<%=janken.yourChoiseString%></li>
		<li>コンピュータの手は<%=janken.pcChoiseString%></li>
	</ul>
	<a href="./JankenServlet">もう一回</a>
</body>
</html>
