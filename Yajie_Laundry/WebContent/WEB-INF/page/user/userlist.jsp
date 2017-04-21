<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<%  
	String path = request.getContextPath();  
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;  
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=basePath %>/scripts/layerui/css/layui.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath %>/scripts/layerui/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath %>/styles/userManager/user.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath %>/styles/jquery.dataTables.min.css" rel="stylesheet" type="text/css"/>
<title>会员列表-会员管理</title>
</head>
<body>
	<div class="main-content">
		<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
		  <legend>查询条件</legend>
		</fieldset>
		<div class="form-content">
			<form class="layui-form layui-form-pane" action="">
				<div class="layui-form-item">
				    <div class="layui-inline">
				      <label class="layui-form-label">手机号</label>
				      <div class="layui-input-inline">
				        <input type="tel" name="phone" autocomplete="off" class="layui-input">
				      </div>
				    </div>
				    <div class="layui-inline">
				      <label class="layui-form-label">用户姓名</label>
				      <div class="layui-input-inline">
				        <input type="text" name="username" autocomplete="off" class="layui-input">
				      </div>
				    </div>
	  			</div>
	  			<div class="layui-form-item">
				    <label class="layui-form-label">所在单位</label>
				    <div class="layui-input-inline">
				      <select name="company" >
				        <option value="" selected="selected">--请选择单位--</option>
				        <option value="0" >邮政储蓄</option>
				        <option value="1">农村信用社</option>
				        <option value="2">农业银行</option>
				      </select>
				    </div>
				    <div class="layui-input-block">
				      <button class="layui-btn" lay-submit="" lay-filter="demo1">查询</button>
				      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
				    </div>
				 </div>
			</form>
		</div>
		
		<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
		  <legend>会员列表-查询结果</legend>
		</fieldset>
		<div class="layui-form">
			<table id="user-list" class="layui-table">
			    <colgroup>
			      <col width="50">
			      <col width="150">
			      <col width="250">
			      <col width="250">
			      <col width="250">
			      <col width="250">
			      <col width="250">
			    </colgroup>
			    <thead>
			      <tr>
			        <th><input type="checkbox" name="" lay-skin="primary" lay-filter="allChoose"></th>
			        <th>姓名</th>
			        <th>手机号</th>
			        <th>登记时间</th>
			        <th>单位</th>
			        <th>最后一次干洗时间</th>
			        <th>操作</th>
			      </tr> 
			    </thead>
		  </table>
	</div>
	<div id="userlistpage"></div>
</div>

<script type="text/javascript" src="<%=basePath %>/scripts/layerui/layui.js"></script>
<script type="text/javascript" src="<%=basePath %>/scripts/jquery.js"></script>
<script type="text/javascript" src="<%=basePath %>/scripts/jquery.dataTables.js"></script>
<script type="text/javascript">
	layui.use(['laypage', 'layer','form'],function(){
		var form = layui.form(); //只有执行了这一步，部分表单元素才会修饰成功
		//自定义验证规则
	  	form.verify({
// 		    title: function(value){
// 		      if(value.length < 5){
// 		        return '标题至少得5个字符啊';
// 		      }
// 		    }
// 		    ,pass: [/(.+){6,12}$/, '密码必须6到12位']
// 		    ,content: function(value){
// 		      layedit.sync(editIndex);
// 		    }
		  });

	  	//监听提交
	    form.on('submit(demo1)', function(data){
	      layer.alert(JSON.stringify(data.field), {
	        title: '最终的提交信息'
	      })
	      return false;
	    });
	});
	var oTable1 = $("#user-list").dataTable({
		"lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]],
		"autoWidth": false,
		"processing": true,
		"serverSide": true,
		"ajax":{
	        url:"userajaxlist.do",
	        type:"POST",
	        contentType : 'application/x-www-form-urlencoded',
	        data:{
	        	"pageIndex":1
	        }
	    },
        "columns":[
            {"data": "username","width":"140"},
            {"data":"umobile","width":"140"},
            {"data":"adddate","width":"140"},
            {"data":"companyname","width":"140"},
            {"data":"adddate","width":"140"},
            {"data":"companyname","width":"140"},
         ],
         "language": {
             "lengthMenu": "每页显示 _MENU_ 条",
             "zeroRecords": "暂无数据",
             "info": "第 _PAGE_ 页,共 _PAGES_页",
             "infoEmpty": "过滤：",
             "sInfoFiltered": "(从 _MAX_ 条记录中过滤)",
             "sSearch": "搜索：",
             "oPaginate": {
 				"sFirst": "首页",
 				"sPrevious": "前一页",
 				"sNext": "后一页",
 				"sLast": "尾页"
 			}
         },
         "jQueryUI" : true,
	     "pagingType": "full_numbers",
	});
</script>
</body>
</html>