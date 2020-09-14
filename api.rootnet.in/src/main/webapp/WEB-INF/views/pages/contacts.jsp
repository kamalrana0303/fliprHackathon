<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table border="1" style="align:center">
	<tr>
		<th>State</th>
		<th>Helpline Number</th>
	</tr>
	<c:forEach var="r" items="${allRegions}" varStatus="status">
		<tr>
			<td>${r.loc}</td>
			<td>${r.number }</td>
		</tr>
	</c:forEach>
</table>