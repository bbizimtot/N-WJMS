<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	
	<script>
		var session = "${sessionScope}";
		if(session != null)
			history.go(1);
	</script>

	<form id="frm" action="./loginProcess" method="post">
		ID : <input type="text" id="member_id" name="member_id">
		PW : <input type="text" id="member_pw" name="member_pw">
		<input type="submit" id="login_btn" value="로그인">
	</form>
</body>
</html>
