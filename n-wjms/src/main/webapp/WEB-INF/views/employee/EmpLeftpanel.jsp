<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="emp_name">${sessionScope.login.member_nm}</div>
<div class="night_work">야근</div>
<div class="leftpanel_menu">
	<ul>
		<li><a href="./EmpMypage" data-ajax="false">마이페이지</a></li>
		<li><a href="./EmpNightworkApply" data-ajax="false">야근신청</a></li>
		<li><a href="./EmpRecentRes" data-ajax="false">최근 이용식당</a></li>
		<li><a href=".././logout" data-ajax="false">로그 아웃</a></li>
	</ul>
</div>