
Ext.onReady(function()
{
	var viewPort = buildMainLayout();
	
        	
});

var buildMainLayout = function(){
	var vp = new Ext.Viewport({
		layout : 'border',
		defaults: {
			bodyStyle: 'padding:5px;'
		},
		//frame : true,
		
		items : [
		    {
		    	region : 'north',
		    	//title  : 'SivaLabs : My Experiments On Technology',
			    height : 50,
			    html : '<center><h1>SivaLabs : My Experiments On Technology</h1></center>',
			    margins: '5 5 5 5'
			    //frame : true
		    },
		    {
		    	region : 'south',
		    	html  : '<center>@Copyright 2011</center>',
		    	//frame : true,
		    	margins: '5 5 5 5'
		    }
		    ,
		    {
		    	region : 'west',
		    	title  : 'Navigation',
		    	width  : 250,
		    	collapsible: true,
		    	split: true,
		    	collapsible: true,
		    	collapseMode: 'mini',
		    	items: [navigationPanel],
		    	margins: '0 0 0 5'
		    }/*,
		    {
		    	region : 'east',
		    	title  : 'East'
		    }*/
		    ,{
		    	region : 'center',
		    	title  : '',
		    	margins: '0 0 0 0'
		    },
		]
	});
	return vp;
};

var navigationPanel = new Ext.Panel({
	html: 'Navigation Links',
	height : 450,
	items:[
	       {
	    	   
	       },
	       {
	    	   
	       }
	       
	]
	
});