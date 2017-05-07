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
<link href="<%=basePath %>/styles/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath %>/styles/dataTables.bootstrap.min.css" rel="stylesheet" type="text/css"/>
<title>会员列表-会员管理</title>
</head>
<body>
	<div class="main-content">
		<fieldset class="layui-elem-field layui-field-title">
		  <legend>会员列表-查询结果</legend>
		</fieldset>
		<table id="user-list" class="table table-striped table-bordered">
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

<script type="text/javascript" src="<%=basePath %>/scripts/layerui/layui.js"></script>
<script type="text/javascript" src="<%=basePath %>/scripts/jquery.js"></script>
<script type="text/javascript" src="<%=basePath %>/scripts/jquery.dataTables.js"></script>
<script type="text/javascript" src="<%=basePath %>/scripts/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/scripts/common/common.js"></script>
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
		"lengthMenu": [[5, 10, 50, -1], [5, 10, 50, "All"]],
		"processing": true,
		"serverSide": true,
		"scrollY": "400px",
	  	"scrollCollapse": true,
		"ajax":{
	        url:"userajaxlist.do",
	        type:"POST",
	        contentType : 'application/x-www-form-urlencoded'
	    },
        "columns":[
			{"data": "uid","width":"30","render":function(data, type, row,   meta){
				return '<input name="sel_user" type="checkbox" lay-skin="primary" value="'+ data +'"/>';
				},"searchable":false,"orderable":false},
            {"data": "username","width":"120","orderable":false},
            {"data":"umobile","width":"120","orderable":false},
            {"data":"addDate","width":"120","searchable":false,"orderable":false},
            {"data":"companyName","width":"120","orderable":false},
            {"data":"addDate","width":"120","searchable":false,"orderable":false},
            {"data":"uid","width":"120","render": function ( data, type, row,   meta ) {
            	return '<a href="userdetail.do?uid='+data
    			+' " class="layui-btn layui-btn-small layui-btn-warm">查看</a>&nbsp;&nbsp;&nbsp;<a href="editUser.do?flag=1&uid='+data
    			+'" class="layui-btn layui-btn-small layui-btn-danger self-btn-edit" onclick="test()">修改</a>';
			},"orderable":false},
         ],
         "language": {
             "lengthMenu": "每页显示 _MENU_ 条",
             "zeroRecords": "暂无数据",
             "info": "第 _PAGE_ 页,共 _PAGES_页",
             "infoEmpty": "暂无数据",
             "infoFiltered": "(从 _MAX_ 条记录中过滤)",
             "search": "搜索：",
             "paginate": {
                 "first":      "首页",
                 "last":       "末页",
                 "next":       "下一页",
                 "previous":   "前一页"
             }
         }
	});

	$(".self-btn-edit").click(function() {
		alert("why  ....!");
	});
</script>
</body>
</html>