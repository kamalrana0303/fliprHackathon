<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table border="1" style="align:center">
	<tr>
		<th>Date</th>
		<th>Notification Title</th>
		<th>Link</th>
	</tr>
	<c:forEach var="r" items="${allNotifications}" varStatus="status">
		<tr>
			<td>${r.title }</td>
			<td><a href="${r.link }">${r.link }</a></td>
		</tr>
	</c:forEach>
</table>