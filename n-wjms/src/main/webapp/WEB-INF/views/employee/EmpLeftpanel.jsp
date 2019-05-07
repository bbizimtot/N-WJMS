<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<div class="emp_name">${sessionScope.login.member_nm}</div>
<c:if test="${sessionScope.login.member_nm == '홍길동'}">
	<div class="night_work">야근</div>
</c:if>
<c:if test="${sessionScope.login.member_nm != '홍길동'}">
	<div class="night_work">칼퇴</div>
</c:if>
<div class="leftpanel_menu">
	<ul>
		<li><a href="./EmpMypage" data-ajax="false">마이페이지</a></li>
		<li><a href="./EmpNightworkApply" data-ajax="false">야근신청</a></li>
		<li><a href="./EmpRecentRes" data-ajax="false">최근 이용식당</a></li>
		<li><a href=".././logout" data-ajax="false">로그 아웃</a></li>
	</ul>
</div>