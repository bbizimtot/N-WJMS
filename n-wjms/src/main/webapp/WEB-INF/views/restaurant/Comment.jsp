<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 한줄평페이지 -->
<div data-role="page" id="r_comment">

	<!-- 왼쪽메뉴패널 -->
	<div data-role="panel" id="left4" data-dismissible="false">
		<%@ include file="../restaurant/ResLeftpanel.jsp"%>
	</div>
	<!-- /왼쪽메뉴패널 -->
	<!-- 헤더 -->
	<div data-role="header" id="headbackground">
		<a id="menubtn" href="#left4" data-ajax="false" class="ui-btn-left"
			data-iconpos="left" data-inline="true"><img class="menuimg"
			src="resources/images/menu.png" alt="menu(icon)" /></a>
		<!-- 제목 -->
		<%@ include file="../common/Title.jsp"%>
		<!-- /제목 -->
		<!-- 네비 -->
		<div data-role="navbar">
			<ul>
				<li><a href="#r_manage" data-icon="lock" data-transition="none">관리</a></li>
				<li><a href="#r_sale" data-icon="shop" data-transition="none">매출</a></li>
				<li><a href="#r_statistics" data-icon="info"
					data-transition="none">통계</a></li>
				<li><a href="#" id="activebtn"
					class="ui-btn-active ui-state-persist" data-icon="comment"
					data-transition="none">한줄평</a></li>
			</ul>
		</div>
		<!-- /네비 -->
	</div>
	<!-- /헤더 -->
	<div data-role="main" class="ui-content">
		<!-- 메인 -->

		<!-- /메인 -->
	</div>
	<!-- footer -->
	<%@ include file="../common/IncludeBottom.jsp"%>
	<!-- /footer -->
</div>
<!-- /한줄평페이지 -->