<%@include file="../taglib.jsp"%>

	<table style="border-collapse: collapse;" border="1" bordercolor="yello" height="500">
		<tbody>
			<tr>
				<td align="center"><h3>Edit User Form</h3></td>
			</tr>
			<tr valign="top" align="right">
				<td>
				<form:form action="updateUser.do" commandName="editUser" method="post">
					<form:hidden path="userId"/>
					<form:hidden path="password"/>
					<table style="border-collapse: collapse; width: 500px;" border="0"
						bordercolor="#006699" cellpadding="2" cellspacing="2">
						<tbody>
							<tr>
								<td width="100" align="right">UserName</td>
								<td width="150"><form:input path="userName" readonly="true"></form:input>
								</td>
							</tr>
							
							<tr>
								<td width="100" align="right">FirstName</td>
								<td><form:input path="firstName"></form:input>
								<form:errors cssStyle="color:red" path="firstName"/>
								</td>
							</tr>
							<tr>
								<td width="100" align="right">LastName</td>
								<td><form:input path="lastName"></form:input>
								<form:errors cssStyle="color:red" path="lastName"/>
								</td>
							</tr>
							<tr>
								<td width="100" align="right">Email</td>
								<td><form:input path="emailId"></form:input>
								<form:errors cssStyle="color:red" path="emailId"/>
								</td>
							</tr>
							<tr>
								<td width="100" align="right">Phone</td>
								<td><form:input path="phone"></form:input>
								<form:errors cssStyle="color:red" path="phone"/>
								</td>
							</tr>
							<tr>
								<td width="100" align="right">Role</td>
								<td>
									<select name="roleId">
										<option value="1">Admin</option>
										<option value="2">User</option>
									</select>
								<form:errors cssStyle="color:red" path="roleId"/>
								</td>
							</tr>
							<tr>
								<td colspan="2" align="center">
								<input name="" value="Update" type="submit"> 
									<input name="" value="Reset" type="reset"> 
									<input onclick="javascript:go('showUsers.do');" 
									value="Back" type="button">
								</td>
							</tr>
						</tbody>
					</table>
				</form:form>
				</td>
			</tr>
		</tbody>
	</table>