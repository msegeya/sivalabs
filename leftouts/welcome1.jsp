<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>ExtJS Welcome</title>
 
       	<link rel="stylesheet" type="text/css" href="extjs/resources/css/ext-all.css" />
       	<script type="text/javascript" src="extjs/adapter/ext/ext-base.js"></script>
       	<script type="text/javascript" src="extjs/ext-all-debug.js"></script>
 
        <script type="text/javascript">
        	Ext.BLANK_IMAGE_URL = 'extjs/resources/images/default/s.gif';
        	Ext.onReady(function(){
        		Ext.QuickTips.init();

				var testButton = new Ext.Button({
					text : 'Test1',
					handler: function(){
								openUserViewWindow();
							 }
					});
        		var panel = new Ext.Panel({
            		//renderTo: document.body,
					//layout : 'fit',
					title: 'Hello',
					height: 200,
					width: 400,
					x: 500,
					y:50,
					items : 
					[						
						testButton
						
					]				
            	});

        		var viewport=new Ext.Viewport({
        			// Position items within this container using
        			// CSS-style absolute positioning.
        			layout:'absolute',
        			items:[panel]
        			});

				var userForm = new Ext.FormPanel({
					layout : 'form',
					//autoHeight: true,
					//width: 250,
					id: 'userForm',
					frame : true,
					items:
						[
							{
								xtype : 'textfield',
								name : 'userId',
								fieldLabel : 'UserId'
							},
							{
								xtype : 'textfield',
								name : 'username',
								fieldLabel : 'UserName'
							},
							{
								xtype : 'textfield',
								name : 'emailId',
								fieldLabel : 'EmailId'
							}
						]
				});
				
    			var openUserViewWindow = function(){
					var win = new Ext.Window({
						//layout: 'form',
						width: 340,
						autoHeight: true,
						closeAction: 'hide',
						items: [userForm]
						});
					win.show();
					userForm.getForm().load(
							{ 
								url: 'getUserById.htm',
								params:{id:1}
							});
        		};
            });
        
        </script>
 
    </head>
    <body>
    	
    </body>
</html>