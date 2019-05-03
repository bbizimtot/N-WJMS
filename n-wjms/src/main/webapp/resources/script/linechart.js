google.load("visualization", "1", {packages:["corechart"]});
google.setOnLoadCallback(drawLineChart);
function drawLineChart() {
  var data = google.visualization.arrayToDataTable([
    ['Year', 'Sales', 'Expenses'],
    ['2013',  1000,      400],
    ['2014',  1170,      460],
    ['2015',  660,       1120],
    ['2016',  1030,      540]
  ]);

  var options = {
    hAxis: {title: 'Year',  titleTextStyle: {color: '#333'}},
    vAxis: {minValue: 0},
    padding: '0px',
    chartArea: {
		left: 50,//left padding
		top: 30, //top padding
		width: '80%'
	},
	legend: {
		position: 'bottom'
	}
  };

  var chart = new google.visualization.AreaChart(document.getElementById('linechart'));
  chart.draw(data, options);
}