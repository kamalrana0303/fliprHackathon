<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<html>
	<head>
		<link href="${pageContext.request.contextPath}/static/bootstrap-4.5.2-dist/css/bootstrap.min.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/static/style.css" rel="stylesheet">
	</head>
	<body>
		<header>
			
			<t:insertAttribute name="header"></t:insertAttribute>
		</header>
		
		<main>
			<t:insertAttribute name="body"></t:insertAttribute>
		</main>
		
		
		
	</body>
</html>