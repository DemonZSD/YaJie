layui.use([ 'layer', 'form' ], function() {
	var layer = layui.layer, $ = layui.jquery, form = layui.form();
	form.verify({
		username : function(value) {
			if (value.length == 0) {
				return '请输入用户名';
			} else if (value.length < 5) {
				return '用户名长度不够';
			}
		}
	});
	var errorCount = 0;
	form.on('submit(login)', function(data){
	    layer.msg(JSON.stringify(data.field));
	    $.ajax({
	    	url:'login/toLogin.do',
	    	dataType: 'json',
	    	type:'post',
	    	data:JSON.stringify(data.field),
	    	contentType:'application/json', //text/html;charset=utf-8
	    	async:false,
	    	success:function(data){
	    		if(data!=null){
	    			window.location.href="login/main.do";
	    		}else{
	    			layer.msg("用户名或密码错误！");
	    			$("#username").val("");
	    			$("#password").val("");
	    			return false;
	    		}
	    	},
	    	error:function(){
	    		layer.msg("error");
	    		return false;
	    	}
	    });
	  });
});