<%@include file="../taglib.jsp"%>

<script src ="js/util.js" type="text/javascript">
	
</script>
	<center>
		<form action="searchContacts.do" method="post">
			<table style="border-collapse: collapse; width: 500px;" border="0"
				bordercolor="#006699">
				<tbody>
					<tr>
						<td>Enter Name</td>
						<td><input name="name" type="text">
						<input value="Search" type="submit"> 
						<input onclick="javascript:go('createContact.do');" value="New Contact"
							type="button">
						</td>
					</tr>
				</tbody>
			</table>
		</form>
		<table style="border-collapse: collapse; width: 500px;" border="1" bordercolor="#006699">
			<tbody>
				<tr bgcolor="lightblue">
					<th>ContactId</th>
					<th>ContactName</th>
					<th>Email</th>
					<th></th>
				</tr>
		<c:if test="${empty CONTACTS_KEY}">
			<tr>
				<td colspan="4">No Results found</td>
			</tr>
		</c:if>
		<c:if test="${! empty CONTACTS_KEY}">
			<c:forEach items="${CONTACTS_KEY}" var="contact">
				<tr>
					<td><c:out value="${contact.contactId}"></c:out>
					</td>
					<td><c:out value="${contact.firstName} ${contact.lastName}"></c:out>
					</td>
					<td><c:out value="${contact.emailId}"></c:out>
					</td>
					<td><a href="updateContact.do?contactId=${contact.contactId}">Edit</a>
						<a href="javascript:deleteContact('deleteContact.do?contactId=${contact.contactId}');">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</c:if>
		</tbody>
		</table>
	</center>
