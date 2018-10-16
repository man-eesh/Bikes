<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assignment</title>
<style>
body {
	background-color: powderblue;
}h3 {
	color: blue;
}

#drop {
	text-align: center !important;
	transform: translate(0%, 0) !important;
}

hr.type_2 {
	margin-left:270px;
	margin-right:270px;
	border: 0;
	height: 2px;
	background: #333;
	background-image: -webkit-linear-gradient(left, #ccc, #333, #ccc);
	background-image: -moz-linear-gradient(left, #ccc, #333, #ccc);
	background-image: -ms-linear-gradient(left, #ccc, #333, #ccc);
	background-image: -o-linear-gradient(left, #ccc, #333, #ccc);
}
</style>
</head>
<body>
	<marquee behaviour="alternate" scrollamount="40"><h1 align="center">VEHICLE FILTERING</h1></marquee>

	<form action="VehicleController" method="get">
		<h3 align="center">Filtering by color</h3>
		<div id="drop">
			<select name="mydropdown1" align="center">
				<option selected disabled>select color</option>
				<option value="black">BLACK</option>
				<option value="blue">BLUE</option>
				<option value="red">RED</option>
				<option value="white">WHITE</option>

			</select>



			<h3 align="center">Filtering by CC</h3>
			<select name="mydropdown2" align="center">
				<option selected disabled>select cc</option>
				<option value="150">>=150</option>
				<option value="200">>=200</option>
				<option value="300">>=300</option>
				<option value="800">>=800</option>

			</select> <br> <br>
			<hr class="type_2">

			<input type="submit" name="color">
			
		</div>
		
		
	</form>


</body>
</html>