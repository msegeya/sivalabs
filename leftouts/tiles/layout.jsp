<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
	<title><tiles:insertAttribute name="title" ignore="true" /></title>
	<link rel="stylesheet" type="text/css" href="extjs/resources/css/ext-all.css" />
	<script type="text/javascript" src="extjs/adapter/ext/ext-base.js"></script>
	<script type="text/javascript" src="extjs/ext-all.js"></script>
 
	<script type="text/javascript" src="js/sivalabs.js"></script>
	
</head>
<body>

	<table style="border-collapse: collapse;" align="center" border="1"
		cellpadding="2" cellspacing="2" width="800">
		<tbody>
			<tr>
				<td colspan="2" height="30">
					<tiles:insertAttribute name="header" />
				</td>
			</tr>
			<tr>
				<td colspan="2" height="30">
					<tiles:insertAttribute name="module_links" />
				</td>
			</tr>
			<tr>
				<td height="450" valign="top" width="150">
					<tiles:insertAttribute name="navigation" />
				</td>
				<td valign="top" width="650">
					<tiles:insertAttribute name="body" />
				</td>
			</tr>
			<tr>
				<td colspan="2" height="30">
					<tiles:insertAttribute name="footer" />
				</td>
			</tr>
		</tbody>
	</table>
</body>
</html>