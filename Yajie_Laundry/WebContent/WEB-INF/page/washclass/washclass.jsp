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
<link href="<%=basePath %>/styles/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath %>/styles/dataTables.bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath %>/styles/washclass/washclass.css" rel="stylesheet" type="text/css"/>
<title>衣物分类列表-衣物分类管理</title>
</head>
<body>
<div class="main-content">
	<fieldset class="layui-elem-field layui-field-title">
	  <legend>衣物分类</legend>
	</fieldset>
	<table id="washclass-list" class="table table-striped table-bordered">
		 <thead>
		      <tr>
		        <th>类别</th>
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
var oTable = $("#washclass-list").dataTable({
	"lengthMenu":[[5, 10, 50, -1], [5, 10, 50, "All"]],
	"processing":true,
	"serverSide":true,
	"scrollY":"400px",
	"scrollCollapse":true,
	"bFilter": false,//关闭search
	"ajax":{
		url:"washclassAjax.do",
		type:"post",
		contentType : 'application/x-www-form-urlencoded'
	},
	"columns":[
		
		{"data":"wname","width":"30","orderable":false}
	],
	"language": {
        "lengthMenu": "每页显示 _MENU_ 条",
        "zeroRecords": "暂无数据",
        "info": "第 _PAGE_ 页,共 _PAGES_页",
        "infoEmpty": "暂无数据",
        "infoFiltered": "(从 _MAX_ 条记录中过滤)",
        "paginate": {
            "first":      "首页",
            "last":       "末页",
            "next":       "下一页",
            "previous":   "前一页"
        }
    }
})
</script>		
</body>
</html>