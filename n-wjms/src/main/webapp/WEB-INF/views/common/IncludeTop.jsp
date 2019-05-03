<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="ko" dir="ltr">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, viewport-fit=cover" />
<meta name="format-detection" content="telephone=no">
<link rel="StyleSheet" href="resources/css/test.css" type="text/css"
	media="screen" />
	
	
<link rel="stylesheet" type="text/css" href="https://nds.nongshim.co.kr/web/css/style.css" media="all"/>
	<link rel="shortcut icon" href="https://nds.nongshim.co.kr/web/images/nds.ico" />
	<script type="text/javascript" src="https://nds.nongshim.co.kr/web/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="https://nds.nongshim.co.kr/web/js/jquery.maskedinput-1.3.min.js"></script>
	<script type="text/javascript" src="https://nds.nongshim.co.kr/web/js/action.js"></script>


<title>N-식권시스템Test</title>

</head>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
	google.charts.load('current', {
		'packages' : [ 'corechart' ]
	});
	google.charts.setOnLoadCallback(drawChart);

	function drawChart() {

		var data = google.visualization.arrayToDataTable([ [ 'Menu', '판매량' ],
				[ '메뉴1', 11 ], [ '메뉴2', 2 ], [ '메뉴3', 2 ], [ '메뉴4', 2 ],
				[ '메뉴5', 7 ] ]);

		var options = {
			title : '메뉴 판매',
			height : 200,
			width : 200,
			is3D : true,
			backgroundColor : '#eee'
		};

		var chart = new google.visualization.PieChart(document
				.getElementById('piechart'));

		chart.draw(data, options);
	}
</script>

<script>
	$(function() {
		$('ul.tab li').click(function() {
			var activeTab = $(this).attr('data-tab');
			$('ul.tab li').removeClass('current');
			$('.tabcontent').removeClass('current');
			$(this).addClass('current');
			$('#' + activeTab).addClass('current');
		})
	});
</script>
<script>
	(function(b, o, i, l, e, r) {
		b.GoogleAnalyticsObject = l;
		b[l] || (b[l] = function() {
			(b[l].q = b[l].q || []).push(arguments)
		});
		b[l].l = +new Date;
		e = o.createElement(i);
		r = o.getElementsByTagName(i)[0];
		e.src = '//www.google-analytics.com/analytics.js';
		r.parentNode.insertBefore(e, r)
	}(window, document, 'script', 'ga'));
	ga('create', 'UA-52746336-1');
	ga('send', 'pageview');
	var isCompleted = {};
	function sampleCompleted(sampleName) {
		if (ga && !isCompleted.hasOwnProperty(sampleName)) {
			ga('send', 'event', 'WebCentralSample', sampleName, 'completed');
			isCompleted[sampleName] = true;
		}
	}
</script>
<body>

	<div id="wrapper">

		<div id="header">
			<img align="middle" src="https://nds.nongshim.co.kr/web/images/new_main/logo01.gif" />
		</div>