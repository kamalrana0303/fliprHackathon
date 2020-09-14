<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
<head>
<title>Covid Management</title>
<style>
ul {
	
	display: block;


}

li {
	
	width:100%;
	margin:3px;
	padding:10px;
	text-decoration:none;
}

a {
	text-decoration: none;
	color:black;
	
}

main .site-section {
	background-color: blue;
	width: 30%;
	color: black;
	height: 100%;
	float: left;
}

a:hover {
	background-color: white;
	text-color: red;
}
</style>
</head>

<header
	style="height: 30%; width: 100%; background-color: blue; text-align: center">
	<h1>Covid Management</h1>
</header>
<main>
	<div class="site-section">
		<nav>
			<ul>
				<li><a href='<c:url value="/Covid-19-in/contacts"></c:url>'>Contacts</a></li>
				<li><a
					href='<c:url value="/Covid-19-in/notifications"></c:url>'>Notifications</a></li>
				<li><a
					href='<c:url value="/Covid-19-in/hospitals/beds"></c:url>'>Hospital</a></li>
				<li><a
					href='<c:url value="/Covid-19-in/hospitals/medical-colleges"></c:url>'>Medical
						Colleges</a></li>

			</ul>
		</nav>

	</div>
	<div class="site-content">Welcome To Covid Management...</div>
</main>
</html>