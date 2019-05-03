google.charts.load('current', {'packages':['bar']});
google.setOnLoadCallback(drawLineChart);

function drawBarChart() {
	var data = google.visualization.arrayToDataTable([
			[ 'Month', 'Sales' ],
			[ '1', 1000 ], [ '2', 1170 ],
			[ '3', 660 ], [ '4', 1030 ] ]);

	var options = {
		width: '50%',
		chartArea: {
			left: 50,//left padding
			top: 30, //top padding
			width: '50%'
		},
		legend: {
			position: 'none'
		},
		bars : 'vertical' // Required for Material Bar Charts.
	};

	var chart = new google.charts.Bar(document
			.getElementById('barchart'));

	chart.draw(data, google.charts.Bar.convertOptions(options));
}