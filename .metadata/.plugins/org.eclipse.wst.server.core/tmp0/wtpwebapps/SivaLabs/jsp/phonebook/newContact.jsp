<%@include file="../taglib.jsp"%>

	<table style="border-collapse: collapse; border="1" bordercolor="#006699" height="500">
		<tbody>
			<tr>
				<td align="center"><h3>New Contact Form</h3></td>
			</tr>
			<tr valign="top" align="center">
				<td align="center">
				<form:form action="createContact.do" commandName="newContact" method="post">
					<form:hidden path="userId"/>
					<table style="border-collapse: collapse; width: 500px;" border="0"
						bordercolor="#006699" cellpadding="2" cellspacing="2">
						<tbody>
							<%-- <tr>
								<td width="100" align="right">UserId</td>
								<td width="150"><form:input path="userId"></form:input></td>
								<td align="left"><form:errors cssStyle="color:red" path="userId"/></td>
							</tr> --%>
							
							<tr>
								<td width="100" align="right">FirstName</td>
								<td width="150"><form:input path="firstName"></form:input></td>
								<td align="left"><form:errors cssStyle="color:red" path="firstName"/></td>
							</tr>
							<tr>
								<td width="100" align="right">LastName</td>
								<td width="150"><form:input path="lastName"></form:input></td>
								<td align="left"><form:errors cssStyle="color:red" path="lastName"/></td>
							</tr>
							<tr>
								<td width="100" align="right">Email</td>
								<td><form:input path="emailId"></form:input></td>
								<td align="left"><form:errors cssStyle="color:red" path="emailId"/></td>
							</tr>
							<tr>
								<td width="100" align="right">Phone</td>
								<td><form:input path="phone"></form:input></td>
								<td align="left"><form:errors cssStyle="color:red" path="phone"/></td>
							</tr>
							
							<tr>
								<td colspan="3" align="center">
								<input name="" value="Save" type="submit"> 
									<input name="" value="Reset" type="reset"> 
									<input onclick="javascript:go('showContacts.do');" 
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
