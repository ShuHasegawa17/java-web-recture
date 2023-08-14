<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="janken.model.JankenBean"%>
<%@ page import="java.util.List"%>

<%
List<JankenBean> jankenList =  (List<JankenBean>)session.getAttribute("jankenList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>janken app</title>
</head>
<body>
	<h1>
		じゃんけんの結果一覧</h1>
	<ul>
		<% for(int i = 0; i < jankenList.size(); i++) { %>
		<li>
			<%= i+1 %>回目
			勝敗は<%= jankenList.get(i).jankenResult %>/
			あなたの手は<%= jankenList.get(i).yourChoiseString %>/
			コンピュータの手は<%= jankenList.get(i).pcChoiseString %>
		</li>
		<% } %>
	</ul>
	<a href="./JankenSessionServlet">もう一回</a>
</body>
</html>
