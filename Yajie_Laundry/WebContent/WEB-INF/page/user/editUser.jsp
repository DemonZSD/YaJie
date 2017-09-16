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
<title>修改会员信息-会员管理</title>
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>修改会员信息</legend>
</fieldset>
 
<form class="layui-form" action="<%=basePath %>/user/editUser.do" method="POST">
	<div class="layui-form-item">
	    <div class="layui-inline">
	      <label class="layui-form-label">姓名</label>
	      <div class="layui-input-inline">
	        <input type="text" name="username" value="${userInfo.username }" lay-verify="required" autocomplete="off"  class="layui-input">
	        <input type="hidden" name="flag" value="2">
	        <input type="hidden" name="uid" value=${userInfo.uid }>
	      </div>
	      <span class="require-input">*</span>
	    </div>
	    <div class="layui-inline">
	      <label class="layui-form-label">手机号</label>
	      <div class="layui-input-inline">
	        <input type="tel" name="umobile" value="${userInfo.umobile }"  lay-verify="phone" autocomplete="off" class="layui-input">
	      </div>
	      <span class="require-input">*</span>
	    </div>
 	 </div>	
 	 
 	 <div class="layui-form-item">
	    <div class="layui-inline">
	      <label class="layui-form-label">固话号</label>
	      <div class="layui-input-inline">
	        <input type="tel" name="utelphone" value="${userInfo.utelphone }" autocomplete="off"  class="layui-input">
	      </div>
	      &nbsp;
	    </div>
	    <div class="layui-inline">
	      <label class="layui-form-label">手机号2</label>
	      <div class="layui-input-inline">
	        <input type="tel" name="umobileBak" value="${userInfo.umobileBak }" lay-verify="umobileBak" autocomplete="off" class="layui-input">
	      </div>
	    </div>
 	 </div>	
 	<div class="layui-form-item">
		<div class="layui-inline">
		    <label class="layui-form-label">单位名称</label>
		    <div class="layui-input-inline">
		      <select name="companyId" lay-search="">
		        <option value="">请选择所在单位</option>
		      	<c:forEach items="${companyList }" var="companyList">
		      		<option value="${companyList.cid}"><c:if test="${companyList.cid==userInfo.companyId}">selected = "selected"</c:if> >${companyList.cname}</option>
		      	</c:forEach>
		      </select>
		    </div>
		  </div>
 	 </div>
	<div class="layui-form-item">
	    <label class="layui-form-label">家庭地址</label>
	    <div class="layui-input-block">
	      <input type="text" name="uhomeAddr" value="${userInfo.uhomeAddr }" autocomplete="off"  class="layui-input">
	    </div>
  	</div>
  	
  	
  	
	<div class="layui-form-item">
	  <div class="layui-input-block">
	    <button class="layui-btn" lay-submit="" lay-filter="form-submit">保存</button>
	    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
	  </div>
	</div>
</form>
<script type="text/javascript" src="<%=basePath %>/scripts/layerui/layui.js"></script>
<script type="text/javascript" src="<%=basePath %>/scripts/jquery.js"></script>
<script type="text/javascript" src="<%=basePath %>/scripts/jquery.dataTables.js"></script>
<script type="text/javascript" src="<%=basePath %>/scripts/dataTables.bootstrap.min.js"></script>
<script type="text/javascript">
layui.use(['laypage', 'layer','form'],function(){
	var form = layui.form(); //只有执行了这一步，部分表单元素才会修饰成功
	form.verify({
		
	});
	//监听提交
    form.on('submit(form-submit)', function(data){
      layer.alert(JSON.stringify(data.field), {
        title: '最终的提交信息'
      })
      return true;
    });
});
</script>
</body>
</html>