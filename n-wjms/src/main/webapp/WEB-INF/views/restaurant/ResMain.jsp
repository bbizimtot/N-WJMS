<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
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
<!-- 차트 load -->
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<!-- /차트 load -->
<!-- css -->
<link rel="stylesheet" href="../resources/css/common.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="../resources/css/restaurant.css" type="text/css"
	media="screen" />
<!-- /css -->
<!-- 차트 js -->
<script type="text/javascript" src="../resources/script/piechart.js"></script>
<script type="text/javascript" src="../resources/script/linechart.js"></script>
<script type="text/javascript" src="../resources/script/barchart.js"></script>
<script type="text/javascript" src="../resources/script/chart2.js"></script>
<!-- /차트 js -->
</head>
<body>
	<%@ include file="../restaurant/Management.jsp"%>
	<%@ include file="../restaurant/Sales.jsp"%>
	<%@ include file="../restaurant/Statistics.jsp"%>
	<%@ include file="../restaurant/Comment.jsp"%>
</body>
</html>