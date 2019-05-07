<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 매출페이지 -->
<div data-role="page" id="r_sale">

	<!-- 왼쪽메뉴패널 -->
	<div data-role="panel" id="left2" data-dismissible="false">
		<%@ include file="../restaurant/ResLeftpanel.jsp"%>
	</div>
	<!-- /왼쪽메뉴패널 -->
	<!-- 헤더 -->
	<div data-role="header" id="headbackground">
		<a id="menubtn" href="#left2" data-ajax="false" class="ui-btn-left"
			data-iconpos="left" data-inline="true"><img class="menuimg"
			src="../resources/images/menu.png" alt="menu(icon)" /></a>
		<!-- 제목 -->
		<%@ include file="../common/Title.jsp"%>
		<!-- /제목 -->
		<!-- 네비 -->
		<div data-role="navbar">
			<ul>
				<li><a href="#r_manage" data-icon="lock" data-transition="none">관리</a></li>
				<li><a href="#" id="activebtn"
					class="ui-btn-active ui-state-persist" data-icon="shop"
					data-transition="none">매출</a></li>
				<li><a href="#r_statistics" data-icon="info"
					data-transition="none">통계 </a></li>
				<li><a href="#r_comment" data-icon="comment"
					data-transition="none">한줄평</a></li>
			</ul>
		</div>
		<!-- /네비 -->
	</div>
	<!-- /헤더 -->
	<div data-role="main" class="ui-content">
		<!-- 메인 -->
		<h3>Contrary to popular belief, Lorem Ipsum is not simply random
			text. It has roots in a piece of classical Latin literature from 45
			BC, making it over 2000 years old. Richard McClintock, a Latin
			professor at Hampden-Sydney College in Virginia, looked up one of the
			more obscure Latin words, consectetur, from a Lorem Ipsum passage,
			and going through the cites of the word in classical literature,
			discovered the undoubtable source. Lorem Ipsum comes from sections
			1.10.32 and 1.10.33 of "de Finibus Bonorum et Malorum" (The Extremes
			of Good and Evil) by Cicero, written in 45 BC. This book is a
			treatise on the theory of ethics, very popular during the
			Renaissance. The first line of Lorem Ipsum, "Lorem ipsum dolor sit
			amet..", comes from a line in section 1.10.32.</h3>
		<!-- /메인 -->
	</div>
	<!-- footer -->
	<%@ include file="../common/IncludeBottom.jsp"%>
	<!-- /footer -->
</div>
<!-- /매출페이지 -->