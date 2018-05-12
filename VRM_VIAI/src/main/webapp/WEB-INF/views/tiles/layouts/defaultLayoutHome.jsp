<!DOCTYPE html>
<!--Welcome.jsp-->
<%@ include file="/WEB-INF/common/taglibs.jsp"%>

<html>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Viai 1.0</title>

<!-- Plugin CSS -->
<link
	href="<c:url value="resources/freelance/vendor/bootstrap/css/bootstrap.min.css"/>"
	rel="stylesheet" type="text/css">

<!-- Custom fonts for this template -->
<link
	href="<c:url value="resources/freelance/vendor/font-awesome/css/font-awesome.min.css"/>"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"
	rel="stylesheet" type="text/css">


<link
	href="<c:url value="resources/freelance/vendor/magnific-popup/magnific-popup.css"/>"
	rel="stylesheet" type="text/css">
<link href="<c:url value="resources/freelance/css/freelancer.min.css"/>"
	rel="stylesheet" type="text/css">



<link href="<c:url value='resources/freelance/css/app.css' />"
	rel="stylesheet"></link>
<link rel="stylesheet" type="text/css"
	href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />

</head>

<body id="page-top">
	<tiles:insertAttribute name="body" />
	<script type="text/javascript"
		src="<c:url value="resources/freelance/vendor/jquery/jquery.min.js"/>"></script>
	<script type="text/javascript"
		src="<c:url value="resources/freelance/vendor/bootstrap/js/bootstrap.bundle.min.js"/>"></script>

	<script type="text/javascript"
		src="<c:url value="resources/freelance/vendor/jquery-easing/jquery.easing.min.js"/>"></script>
	<script type="text/javascript"
		src="<c:url value="resources/freelance/vendor/magnific-popup/jquery.magnific-popup.min.js"/>"></script>

	<script type="text/javascript"
		src="<c:url value="resources/freelance/js/jqBootstrapValidation.js"/>"></script>
	<script type="text/javascript"
		src="<c:url value="resources/freelance/js/freelancer.min.js"/>"></script>
	<script type="text/javascript"
		src="<c:url value="resources/js/to/charts/dist/Chart.js"/>"></script>
	<script type="text/javascript"
		src="<c:url value="resources/js/to/charts/dist/Chart.bundle.min.js"/>"></script>
	<script type="text/javascript"
		src="<c:url value="resources/js/to/charts/dist/utils.js"/>"></script>	
	<script>
		var randomScalingFactor = function() {
			return Math.round(Math.random() * 100);
		};
		var config = {
			type: 'doughnut',
			data: {
				datasets: [{
					data: [
						randomScalingFactor(),
						randomScalingFactor(),
						randomScalingFactor(),
						randomScalingFactor(),
						randomScalingFactor(),
					],
					backgroundColor: [
						window.chartColors.yellow,
						window.chartColors.orange,
						window.chartColors.yellow,
						window.chartColors.green,
						window.chartColors.blue,
					],
					label: 'Dataset 1'
				}],
				labels: [
					'Red',
					'Orange',
					'Yellow',
					'Green',
					'Blue'
				]
			},
			options: {
				responsive: true,
				legend: {
					position: 'top',
				},	
				title: {
					display: true,
					text: 'Chart.js Doughnut Chart'
				},
				animation: {
					animateScale: true,
					animateRotate: true
				}
			}
		};
		window.onload = function() {
			var ctx = document.getElementById('chart-area').getContext('2d');
			window.myDoughnut = new Chart(ctx, config);
		};
		document.getElementById('randomizeData').addEventListener('click', function() {
			config.data.datasets.forEach(function(dataset) {
				dataset.data = dataset.data.map(function() {
					return randomScalingFactor();
				});
			});
			window.myDoughnut.update();
		});
		var colorNames = Object.keys(window.chartColors);
		document.getElementById('addDataset').addEventListener('click', function() {
			var newDataset = {
				backgroundColor: [],
				data: [],
				label: 'New dataset ' + config.data.datasets.length,
			};
			for (var index = 0; index < config.data.labels.length; ++index) {
				newDataset.data.push(randomScalingFactor());
				var colorName = colorNames[index % colorNames.length];
				var newColor = window.chartColors[colorName];
				newDataset.backgroundColor.push(newColor);
			}
			config.data.datasets.push(newDataset);
			window.myDoughnut.update();
		});
		document.getElementById('addData').addEventListener('click', function() {
			if (config.data.datasets.length > 0) {
				config.data.labels.push('data #' + config.data.labels.length);
				var colorName = colorNames[config.data.datasets[0].data.length % colorNames.length];
				var newColor = window.chartColors[colorName];
				config.data.datasets.forEach(function(dataset) {
					dataset.data.push(randomScalingFactor());
					dataset.backgroundColor.push(newColor);
				});
				window.myDoughnut.update();
			}
		});
		document.getElementById('removeDataset').addEventListener('click', function() {
			config.data.datasets.splice(0, 1);
			window.myDoughnut.update();
		});
		document.getElementById('removeData').addEventListener('click', function() {
			config.data.labels.splice(-1, 1); // remove the label first
			config.data.datasets.forEach(function(dataset) {
				dataset.data.pop();
				dataset.backgroundColor.pop();
			});
			window.myDoughnut.update();
		});
		document.getElementById('changeCircleSize').addEventListener('click', function() {
			if (window.myDoughnut.options.circumference === Math.PI) {
				window.myDoughnut.options.circumference = 2 * Math.PI;
				window.myDoughnut.options.rotation = -Math.PI / 2;
			} else {
				window.myDoughnut.options.circumference = Math.PI;
				window.myDoughnut.options.rotation = -Math.PI;
			}
			window.myDoughnut.update();
		});
	</script>
	<!-- JS,JQ,BT.JS
	<script type="text/javascript"  src="<c:url value="/resources/jquery/jquery-3.2.1.js" />"></script>
	<script type="text/javascript"  src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    -->

</body>
</html>