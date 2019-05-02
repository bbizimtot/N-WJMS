<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<form id="frm" action="/nwjms/loginProcess" method="post">
		ID : <input type="text" id="user_id" name="mid">
		PW : <input type="text" id="user_pw" name="mpw">
		<input type="submit" id="login_btn" value="로그인">
	</form>
</body>
</html>
