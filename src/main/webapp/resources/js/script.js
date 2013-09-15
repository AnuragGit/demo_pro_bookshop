$(document).ready(function(){
	
	var link = $('a').click(function(){
		
		return $('a').attr('href');
		
	});
	
	TakeOverPageContent.getSelectedPageContent(link);
	
	
});

var TakeOverPageContent={};

TakeOverPageContent.getSelectedPageContent = function(page){
	
   if(page =="login"){
	   TakeOverPageContent.showLogin();
   }else if(page==""){
	   
	   
   }	
	
	
};

TakeOverPageContent.showLogin = function(){
	
	
}

