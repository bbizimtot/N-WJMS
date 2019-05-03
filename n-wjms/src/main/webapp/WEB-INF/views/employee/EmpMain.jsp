<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html id="html">
<head>
<title>>N-WJMS</title>
<!-- 폰트 -->
<link href="https://fonts.googleapis.com/css?family=Jua"
	rel="stylesheet">
<!-- /폰트 -->
<!-- 모바일 jquery mobile -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<!-- /모바일 jquery mobile -->
<!-- css -->
<link rel="stylesheet" href="resources/css/common.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="resources/css/employee.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="resources/css/empleftpanel.css"
	type="text/css" media="screen" />
<link rel="stylesheet" href="resources/css/map.css" type="text/css"
	media="screen" />
<!-- /css -->
</head>
<body>
	<div data-role="page" id="emp_main">
		<!-- 왼쪽메뉴패널 -->
		<div data-role="panel" id="lefte-1" data-dismissible="false">
			<%@ include file="EmpLeftpanel.jsp"%>
		</div>
		<!-- /왼쪽메뉴패널 -->
		<!-- 헤더 -->
		<div data-role="header" id="headbackground">
			<a id="menubtn" href="#lefte-1" data-ajax="false" class="ui-btn-left"
				data-iconpos="left" data-inline="true"><img class="menuimg"
				src="resources/images/menu.png" alt="menu(icon)" /></a>
			<!-- /제목 -->
			<%@ include file="../common/Title.jsp"%>
			<!-- 제목 -->
		</div>
		<!-- /헤더 -->
		<div data-role="main" class="ui-content main">

			<div id="map" style="width: 100%; height: 350px;"></div>
			<div class="rank_container">
				<p>랭킹</p>
				<div class="rank">
					<ul>
						 <li>
                        <a href="#emp_resinfo" data-transition="slide" class="rank_img rank_cont">
                            <img src="https://nds.nongshim.co.kr/web/images/new_main/logo02.gif" alt="NDS(로고)" />
                        </a>
                        <a href="#emp_resinfo" data-transition="slide" class="rank_cont">
                            식당이름 별점<br/>
                            방문수 한줄평수
                        </a>
                    </li>
                    <li>
                        <a href="#emp_resinfo" data-transition="slide" class="rank_img rank_cont">
                            <img src="https://nds.nongshim.co.kr/web/images/new_main/logo02.gif" alt="NDS(로고)" />
                        </a>
                        <a href="#emp_resinfo" data-transition="slide" class="rank_cont">
                            식당이름 별점<br/>
                            방문수 한줄평수
                        </a>
                    </li>
                    <li>
                        <a href="#emp_resinfo" data-transition="slide" class="rank_img rank_cont">
                            <img src="https://nds.nongshim.co.kr/web/images/new_main/logo02.gif" alt="NDS(로고)" />
                        </a>
                        <a href="#emp_resinfo" data-transition="slide" class="rank_cont">
                            식당이름 별점<br/>
                            방문수 한줄평수
                        </a>
                    </li>
					</ul>
				</div>
			</div>
		</div>
	<!-- footer -->
	<%@ include file="../common/IncludeBottom.jsp"%>
	<!-- /footer -->
	</div>
	<%@ include file="EmpResInfo.jsp"%>
	<!-- 맵 load -->
	<script type="text/javascript"
		src="//dapi.kakao.com/v2/maps/sdk.js?appkey=fb85c2ff4a4c7202d78fd98195a6b76d&libraries=services"></script>
	<!-- 맵 load -->
	<!-- 맵 js -->
	<script type="text/javascript" src="resources/script/map.js"></script>
	<!-- /맵 js -->
</body>
</html>