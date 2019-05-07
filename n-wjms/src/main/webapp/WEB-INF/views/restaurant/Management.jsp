<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 관리페이지 -->
<div data-role="page" id="r_manage">
	<!-- 왼쪽메뉴패널 -->
	<div data-role="panel" id="left1" data-dismissible="false">
		<%@ include file="../restaurant/ResLeftpanel.jsp"%>
	</div>
	<!-- /왼쪽메뉴패널 -->
	<!-- 헤더 -->
	<div data-role="header" id="headbackground">
		<a id="menubtn" href="#left1" data-ajax="false" class="ui-btn-left"
			data-iconpos="left" data-inline="true"><img class="menuimg"
			src="../resources/images/menu.png" alt="menu(icon)" /></a>
		<!-- /제목 -->
		<%@ include file="../common/Title.jsp"%>
		<!-- 제목 -->
		<!-- 네비 -->
		<div data-role="navbar">
			<ul>
				<li><a href="#" id="activebtn"
					class="ui-btn-active ui-state-persist" data-icon="lock"
					data-transition="none">관리</a></li>
				<li><a href="#r_sale" data-icon="shop" data-transition="none">매출</a></li>
				<li><a href="#r_statistics" data-icon="info"
					data-transition="none">통계</a></li>
				<li><a href="#r_comment" data-icon="comment"
					data-transition="none">한줄평</a></li>
			</ul>
		</div>
		<!-- /네비 -->
	</div>
	<!-- /헤더 -->
	<div data-role="main" class="ui-content">
		<!-- 메인 -->
		<p>SN = ${SN}</p>
		<h3>Lorem Ipsum is simply dummy text of the printing and
			typesetting industry. Lorem Ipsum has been the industry's standard
			dummy text ever since the 1500s, when an unknown printer took a
			galley of type and scrambled it to make a type specimen book. It has
			survived not only five centuries, but also the leap into electronic
			typesetting, remaining essentially unchanged. It was popularised in
			the 1960s with the release of Letraset sheets containing Lorem Ipsum
			passages, and more recently with desktop publishing software like
			Aldus PageMaker including versions of Lorem Ipsum.</h3>
		<!-- /메인 -->
	</div>
	<!-- footer -->
	<%@ include file="../common/IncludeBottom.jsp"%>
	<!-- /footer -->
</div>
<!-- /관리페이지 -->