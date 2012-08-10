
        <script type="text/javascript">
        	Ext.BLANK_IMAGE_URL = 'extjs/resources/images/default/s.gif';
        	Ext.onReady(function(){
        		Ext.QuickTips.init();
				
        		var store = new Ext.data.JsonStore({
        			url: 'getAllPrivileges.do',
        			root: 'data',
        			fields: ['id', 'name', 'description']
        			});
        		
    		new Ext.grid.GridPanel({
    				renderTo: 'privilegesGridPanel',
        			title:'Privileges Grid',
        			store: store,
        			columns: [
        			{ header: "ID", width: 50, dataIndex: 'id',	sortable: true },
        			{ id: 'name', header: "Name", width: 180,	dataIndex: 'name', sortable: true },
        			{ header: "Description", width: 200, dataIndex: 'description',	sortable: true }        			
        			],
        			//autoExpandColumn: 'userName',
        			width: 500,
        			height: 300,
        			loadMask: true
        			});
        			store.load();
        						    			
            });
        
        </script>
<div id="privilegesGridPanel"></div>