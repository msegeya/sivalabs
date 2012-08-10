<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
	<title><tiles:insertAttribute name="title" ignore="true" /></title>
	<link rel="stylesheet" type="text/css" href="css/style.css" />
	<link rel="stylesheet" type="text/css" href="extjs/resources/css/ext-all.css" />
	<script type="text/javascript" src="extjs/adapter/ext/ext-base.js"></script>
	<script type="text/javascript" src="extjs/ext-all.js"></script>
 
	<script src ="js/util.js" type="text/javascript"></script>
	
</head>
<body>

<CENTER>
	<table width="900" cellspacing="0" cellpadding="0" border="0">
		<tbody>		  
		 <tr>
		 	<td colspan="2"  bgcolor="#637c8b" align="left">
		 		<tiles:insertAttribute name="header" />
		 	</td>
		 </tr>		  
		 <tr height="350">
			    <td valign="top" align="center" colspan="2" height="30" bgcolor="#ffffff">
			    	<table width="100%" height="420" cellspacing="1" cellpadding="0" border="0" align="center">
			    		<tr bgcolor="#d5dcdf">			    			
			    			<td valign="top" >
			    				<tiles:insertAttribute name="body" />
			    			</td>			    					    			
			    		</tr>
			    	</table>
			    </td>
		    </tr>
		    <tr>
		    	<td colspan="2" align="center"  height="20" bgcolor="#25587E">
		    		<tiles:insertAttribute name="footer" />
		   		 </td>
		    </tr>
		</tbody>
	</table>	
</CENTER>
</body>
</html>