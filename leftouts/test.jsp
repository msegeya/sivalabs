<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>ExtJS Welcome</title>
 
       	<link rel="stylesheet" type="text/css" href="extjs/resources/css/ext-all.css" />
       	<script type="text/javascript" src="extjs/adapter/ext/ext-base.js"></script>
       	<script type="text/javascript" src="extjs/ext-all-debug.js"></script>
 
        <script type="text/javascript">
        	Ext.BLANK_IMAGE_URL = 'extjs/resources/images/default/s.gif';
        	Ext.onReady(function()
   			{
        		Ext.QuickTips.init();
				var userJSON = {
						'username':'siva', 
						'emailId' :'siva@gmail.com'
				};
				//alert(userJSON);
        		Ext.Ajax.request({
        	         url : 'something.htm',
  	                  method: 'POST',
  	                  headers: {
  	                  		'Content-Type': 'application/json'
  	              	  },  	                  
  	                  params : {
  	                				"username" : "admin",
  	                				"emailId" : "admin@sivalabs.com"
  	  	             		 },
  	  	             jsonData: {
			           				"username" : "admin1111",
			          				"emailId" : "admin11111@sivalabs.com"
			             		 
  	  	             		 },
  	                  success: function (response) {
  	                	var jsonResp = Ext.util.JSON.decode(response.responseText);
  	                    Ext.Msg.alert("Info","UserName from Server : "+jsonResp.username);
  	               		},
  	                  failure: function (response) {
  	                	var jsonResp = Ext.util.JSON.decode(response.responseText);
  	                	Ext.Msg.alert("Error",jsonResp.error);
  	               	  }
  	       });


        		
   			});
   		</script>
</head>
<body>
<form action="something.htm" method="post">
	Name: <input type="text" name="username">
	<input type="submit" value="Submit">
</form>
</body>
</html>