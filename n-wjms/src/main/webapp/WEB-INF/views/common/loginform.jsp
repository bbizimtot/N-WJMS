<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<script>
		var session = "${sessionScope}";
		if (session != null)
			history.go(1);
	</script>

	<form id="frm" action="./loginProcess" method="post">
		ID : <input type="text" id="member_id" name="member_id" value="aaa">
		PW : <input type="text" id="member_pw" name="member_pw" value="111">
		<input type="submit" id="login_btn" value="로그인">
	</form>
</body>
</html>
