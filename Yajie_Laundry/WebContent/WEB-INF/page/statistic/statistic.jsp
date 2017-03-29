<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
	String path = request.getContextPath();  
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;  
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=basePath %>/scripts/amcharts/amcharts.js"></script>
<script type="text/javascript">
var chart;

var chartData = [{
    year: '2005/01/02',
    income: 23.5,
    expenses: 18.1
}, {
    year: '2005/03/02',
    month:1,
    income: 26.2,
    expenses: 22.8
}, {
    year: '2005/04/02',
    month:1,
    income: 30.1,
    expenses: 23.9
}, {
    year: '2005/05/02',
    month:1,
    income: 29.5,
    expenses: 25.1
}, {
    year: '2005/06/02',
    month:1,
    income: 24.6,
    expenses: 25.0
}];


AmCharts.ready(function () {
    // SERIAL CHART
    chart = new AmCharts.AmSerialChart();
    chart.dataProvider = chartData;
    chart.categoryField = "year";
    chart.startDuration = 1;
    chart.plotAreaBorderColor = "#DADADA";
    chart.plotAreaBorderAlpha = 1;
    // this single line makes the chart a bar chart          
    chart.rotate = true;

    // AXES
    // Category
    var categoryAxis = chart.categoryAxis;
    categoryAxis.gridPosition = "start";
    categoryAxis.gridAlpha = 0.1;
    categoryAxis.axisAlpha = 0;

    // Value
    var valueAxis = new AmCharts.ValueAxis();
    valueAxis.axisAlpha = 0;
    valueAxis.gridAlpha = 0.1;
    valueAxis.position = "left";
    chart.addValueAxis(valueAxis);
	
    // GRAPHS
    // first graph
    var graph1 = new AmCharts.AmGraph();
    graph1.type = "column";
    graph1.title = "收入";
    graph1.valueField = "income";
    graph1.balloonText = "收入:[[value]]";
    graph1.lineAlpha = 0;
    graph1.fillColors = "#ADD981";
    graph1.fillAlphas = 1;
    chart.addGraph(graph1);

    // second graph
    var graph2 = new AmCharts.AmGraph();
    graph2.type = "column";
    graph2.title = "支出";
    graph2.valueField = "expenses";
    graph2.balloonText = "支出:[[value]]";
    graph2.lineAlpha = 0;
    graph2.fillColors = "#81acd9";
    graph2.fillAlphas = 1;
    chart.addGraph(graph2);

    // LEGEND
    var legend = new AmCharts.AmLegend();
    chart.addLegend(legend);

    // WRITE
    chart.write("chartdiv");
});
</script>
</head>
<body>
<div class="">
	<blockquote class="layui-elem-quote">这个貌似不用多介绍，因为你已经在太多的地方都看到</blockquote>
	<div id="chartdiv" style="width: 700px; height: 600px;display: inline-block;"></div>
	<div class="" style="display: inline-block;">
		asjfksajkf
	</div>
</div>

</body>
</html>