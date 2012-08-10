<%@include file="../taglib.jsp"%>

<script src ="js/util.js" type="text/javascript">
	
</script>

	<center>
		<form action="searchUsers.do" method="post">
			<table style="border-collapse: collapse; width: 500px;" border="0"
				bordercolor="#006699">
				<tbody>
					<tr>
						<td>Enter Name</td>
						<td><input name="name" type="text"> 
						<input value="Search" type="submit"> 
						<input onclick="javascript:go('createUser.do');" value="New User"
							type="button">
						</td>
					</tr>
				</tbody>
			</table>
		</form>
		<table style="border-collapse: collapse; width: 500px;" border="1" bordercolor="#006699">
			<tbody>
				<tr bgcolor="lightblue">
					<th>UserId</th>
					<th>UserName</th>
					<th>Email</th>
					<th></th>
				</tr>
		<c:if test="${empty USERS_KEY}">
			<tr>
				<td colspan="4">No Results found</td>
			</tr>
		</c:if>
		<c:if test="${! empty USERS_KEY}">
			<c:forEach items="${USERS_KEY}" var="user">
				<tr>
					<td><c:out value="${user.userId}"></c:out>
					</td>
					<td><c:out value="${user.userName}"></c:out>
					</td>
					<td><c:out value="${user.emailId}"></c:out>
					</td>
					<td><a href="updateUser.do?userId=${user.userId}">Edit</a>
						<a href="javascript:deleteUser('deleteUser.do?userId=${user.userId}');">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</c:if>
		</tbody>
		</table>
	</center>
