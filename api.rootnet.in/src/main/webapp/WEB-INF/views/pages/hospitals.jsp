<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table border="1" style="align:center">
	<tr>
		<th>State</th>
		<th>Rural Hospitals</th>
		<th>Rural Beds</th>
		<th>Urban Hospitals</th>
		<th>Urban Beds</th>
		<th>Total Hospitals</th>
		<th>Total Beds</th>
	</tr>
	<c:forEach var="r" items="${allRegionals}" varStatus="status">
		<tr>
			<td>${r.state }</td>
			<td>${r.ruralHospitals }</td>
			<td>${r.ruralBeds }</td>
			<td>${r.urbanHospitals}</td>
			<td>${r.urbanBeds }</td>
			<td>${r.totalHospitals }</td>
			<td>${r.totalBeds }</td>
		</tr>
	</c:forEach>
</table>