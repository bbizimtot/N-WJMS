<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div data-role="page" id="emp_resinfo">
	<!-- 왼쪽메뉴패널 -->
	<div data-role="panel" id="lefte-2" data-dismissible="false">
		<%@ include file="EmpLeftpanel.jsp"%>
	</div>
	<!-- /왼쪽메뉴패널 -->
	<!-- 헤더 -->
	<div data-role="header" id="headbackground">
		<a id="menubtn" href="#lefte-2" data-ajax="false" class="ui-btn-left"
			data-iconpos="left" data-inline="true"><img class="menuimg"
			src="../resources/images/menu.png" alt="menu(icon)" /></a>
		<!-- /제목 -->
		<%@ include file="../common/Title.jsp"%>
		<!-- 제목 -->
	</div>
	<!-- /헤더 -->
	<div data-role="main" class="ui-content main">
		
		
   		식당정보페이지입니다.
         
	</div>
	<!-- footer -->
	<%@ include file="../common/IncludeBottom.jsp"%>
	<!-- /footer -->
</div>
