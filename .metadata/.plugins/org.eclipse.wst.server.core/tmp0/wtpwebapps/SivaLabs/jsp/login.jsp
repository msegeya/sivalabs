<%@include file="taglib.jsp" %>
<center>
	<form:form action="login.do" method="post" commandName="login">
		<table>
			<tr>
				<td colspan="2"><span style="color: red">${ERROR}</span></td>
			</tr>
			<tr>
				<td>UserName</td>
				<td><form:input path="userName"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="password"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Login"></td>
			</tr>
		</table>		
	</form:form>
</center>