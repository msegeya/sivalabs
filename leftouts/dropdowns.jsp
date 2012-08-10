<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>ExtJS Dropdowns</title>
 
       	<link rel="stylesheet" type="text/css" href="extjs/resources/css/ext-all.css" />
       	<script type="text/javascript" src="extjs/adapter/ext/ext-base.js"></script>
       	<script type="text/javascript" src="extjs/ext-all-debug.js"></script>
 
        <script type="text/javascript">
        	Ext.BLANK_IMAGE_URL = 'extjs/resources/images/default/s.gif';
        	Ext.onReady(function(){
        		Ext.QuickTips.init();
				
        		var genders = [
        		                   ['Male'],
        		                   ['Female']
        		                   ];
        		
        		var genderStore = new Ext.data.SimpleStore({
        			fields:['name'],
        			data : genders
        			});
        		
        		var countryStore = new Ext.data.JsonStore({
        			url: 'getCountries.htm',
        			//baseParams : {},
        			root: 'data',
        			idProperty: 'id',
        			fields:[{name:'name'},{name:'id', type: 'int'}]
        			});
        		
        		var favoriteMoviesStore = new Ext.data.JsonStore({
        			url: 'getFavoriteMovies.htm',
        			//baseParams:{cmd:'xyz'},
        			root: 'data',
        			idProperty: 'id',
        			fields:[{name:'name'},{name:'id', type: 'int'}]
        			});
        		
        		
        		
				var sampleForm = new Ext.FormPanel({
					id: 'sampleForm',
					title : 'Registration Form',
					url : 'register.htm',
					frame : true,
					width: 300,
					height : 250,
					items :
						[
						 {
							 xtype : 'textfield',
							 name: 'username',
							 fieldLabel: 'UserName',
							 allowBlank : false,
							 blankText: 'Please Enter UserName',
							 emptyText: 'UserName',
							 msgTarget: 'side'
						 },
						 {
							 xtype : 'textfield',
							 inputType : 'password', 
							 name: 'password',
							 fieldLabel: 'Password',
							 allowBlank : false,
							 blankText: 'Please Enter Password',
							 emptyText: 'Password',
							 msgTarget: 'side'
						 },
						 {
							xtype : 'datefield',
							name: 'dob',
							fieldLabel: 'Date Of Birth'
							
						 },
						 {
							 xtype:'combo',
							 store: genderStore,
							 displayField: 'name',
							 valueField: 'name',
							 editable: false,
							 mode: 'local',
							 forceSelection: true,
							 triggerAction: 'all',
							 fieldLabel: 'Gender',
							 emptyText: 'Select Gender',
							 selectOnFocus: true
						 },
						 {
							 xtype:'combo',
							 store: countryStore,
							 displayField: 'name',
							 valueField: 'id',
							 editable: false,
							 mode: 'remote',
							 forceSelection: true,
							 triggerAction: 'all',
							 fieldLabel: 'Country',
							 emptyText: 'Select Country',
							 selectOnFocus: true
						 }
						 ,
						 {
							 xtype:'combo',
							 store: favoriteMoviesStore,
							 displayField: 'name',
							 valueField: 'id',
							 editable: true,
							 mode: 'remote',
							 forceSelection: true,
							 triggerAction: 'all',
							 fieldLabel: 'Favorite Movie',
							 emptyText: 'Select A Movie',
							 minChars: 2,
							// anchor: '100%',
							 pageSize: 0,
							 //hideTrigger: true,
							 typeAhead: true,
							 selectOnFocus: true
						 }
						 
						 ]
				});
				
				var navigationPanel = new Ext.Panel({
					html: 'Navigation Links',
					height : 450,
					items:[
					       ]
					
				});
				
				/*var viewport = */ new Ext.Viewport({
            		layout : 'border',
					//title: 'Hello',
					defaults: {
        				//collapsible: true,
        				split: true,
        				bodyStyle: 'padding:5px'
        				},
					//frame : true,
					items : [
								{
									region : 'north',
									//title  : 'SivaLabs : My Experiments On Technology',
								    height : 50,
								    html : '<center><h1>SivaLabs : My Experiments On Technology</h1></center>',
								    margins: '5 5 5 5',
								    frame : true
								},
								{
									region : 'south',
									html  : '<center>@Copyright 2011</center>',
									frame : true,
									margins: '5 5 5 5'
								},
								{
									region : 'west',
									title  : 'Navigation',
									width  : 250,
									split: true,
									collapsible: true,
									//collapseMode: 'mini',
									items: [navigationPanel],
									margins: '0 0 0 5'
								},
								{
									region : 'east',
									title  : 'East',
									width  : 200,
									collapsible: true,
									margins: '0 0 0 0',
									cmargins: '0 0 0 5',
									collapsed: true,
									items : []
								}
								,{
									region : 'center',
									title  : '',
									margins: '0 0 0 0',
									items : [sampleForm]
								},
					         ]
					
								
            	});        	
    		
            });
        
        </script>
 
    </head>
    <body>
    	
    </body>
</html>