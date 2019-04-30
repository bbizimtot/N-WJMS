<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- JSTL Core -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- JSTL SQL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Home</title>
</head>
<body>
	<h1>admin_infoList</h1>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>비밀번호</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${list}">
				<tr>
				<!-- EL 표기 -->
					<td><c:out value="${item.admin_id}"/></td>
					<td><c:out value="${item.admin_pw}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
