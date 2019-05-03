google.load("visualization", "1", {packages:["corechart"]});
google.setOnLoadCallback(drawPieChart);

function drawPieChart() {

	var data = google.visualization.arrayToDataTable([ [ 'Menu', '판매량' ],
			[ '참치김치볶음밥', 11 ], [ '치즈돈까스', 2 ], [ '떡라면', 2 ], [ '김치찌개', 2 ],
			[ '육개장', 7 ] ]);

	var options = {
		is3D : true,
		backgroundColor : '#fff',
		chartArea: {
			left: 30,//left padding
			top: 30, //top padding
			width: '100%',
			height: '70%'
		}
	};

	var chart = new google.visualization.PieChart(document
			.getElementById('piechart'));

	chart.draw(data, options);
}