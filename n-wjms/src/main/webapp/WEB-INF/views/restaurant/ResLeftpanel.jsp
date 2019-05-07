<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<div class="emp_name">${sessionScope.login.member_nm}</div>
<div class="night_work">test</div>
<div class="leftpanel_menu">
	<ul>
		<li><a href="./EmpMypage" data-ajax="false">마이페이지</a></li>
		<li><a href=".././logout" data-ajax="false">로그 아웃</a></li>
	</ul>
</div>