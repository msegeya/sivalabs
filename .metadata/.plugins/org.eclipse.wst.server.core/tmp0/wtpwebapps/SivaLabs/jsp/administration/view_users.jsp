
        <script type="text/javascript">
        	Ext.BLANK_IMAGE_URL = 'extjs/resources/images/default/s.gif';
        	Ext.onReady(function(){
        		Ext.QuickTips.init();
				
        		var store = new Ext.data.JsonStore({
        			url: 'getAllUsers.do',
        			root: 'data',
        			fields: ['id', 'userName', 'password', 'firstName']
        			});
        		
    		new Ext.grid.GridPanel({
    				renderTo: 'usersGridPanel',
        			title:'Users Grid',
        			store: store,
        			columns: [
        			{ header: "ID", width: 30, dataIndex: 'id',	sortable: true, hidden:true },
        			{ id: 'userName', header: "UserName", width: 180,	dataIndex: 'userName', sortable: true },
        			{ header: "Password", width: 75, dataIndex: 'password',	sortable: true },
        			{ header: "FirstName", width: 75, dataIndex: 'firstName',	sortable: true, align: 'center' }
        			],
        			//autoExpandColumn: 'userName',
        			width: 600,
        			height: 300,
        			loadMask: true
        			});
        			store.load();
        						    			
            });
        
        </script>
<div id="usersGridPanel"></div>