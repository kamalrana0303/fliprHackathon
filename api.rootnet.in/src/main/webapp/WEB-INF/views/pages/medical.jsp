<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table border="1" style="align:center">
	<tr>
		<th>State</th>
		<th>Institute Name</th>
		<th>City</th>
		<th>Type</th>
		<th>Admission Capacity</th>
		<th>Hospital Beds</th>
		
	</tr>
	
	<c:forEach var="r" items="${colleges}" varStatus="status">
	
		<tr>
			<td>${r.state }</td>
			<td>${r.name }</td>
			<td>${r.city }</td>
			<td>${r.ownership }</td>
			<td>${r.admissionCapacity }</td>
			<td>${r.hospitalBeds }</td>
		</tr>
		
	</c:forEach>
</table>