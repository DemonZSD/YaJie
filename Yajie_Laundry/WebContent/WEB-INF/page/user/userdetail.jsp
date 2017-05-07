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
<title>会员信息详情-会员管理</title>
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>会员信息详情</legend>
</fieldset>
<div class="layui-form layui-form-pane">
	<div class="layui-form-item">
	    <div class="layui-inline">
	      <label class="layui-form-label">姓名</label>
	      <div class="layui-input-inline">
	        <input type="text" name="username" value="${userInfo.username }" disabled="disabled" class="layui-input">
	      </div>
	    </div>
	    <div class="layui-inline">
	      <label class="layui-form-label">手机号</label>
	      <div class="layui-input-inline">
	        <input type="tel" name="umobile" value="${userInfo.umobile }" disabled="disabled"  class="layui-input">
	      </div>
	    </div>
 	 </div>	
 	 
 	 <div class="layui-form-item">
	    <div class="layui-inline">
	      <label class="layui-form-label">固话号</label>
	      <div class="layui-input-inline">
	        <input type="tel" name="utelphone" value="${userInfo.utelphone }" disabled="disabled"  class="layui-input">
	      </div>
	      &nbsp;
	    </div>
	    <div class="layui-inline">
	      <label class="layui-form-label">手机号2</label>
	      <div class="layui-input-inline">
	        <input type="tel" name="umobileBak" value="${userInfo.umobileBak }" disabled="disabled" class="layui-input">
	      </div>
	    </div>
 	 </div>	
 	<div class="layui-form-item">
		<div class="layui-inline">
		    <label class="layui-form-label">单位名称</label>
		    <div class="layui-input-inline">
	        <input type="tel" name="umobileBak" value="${userInfo.companyName }" disabled="disabled" class="layui-input">
	      </div>
		  </div>
 	 </div>
 	 <div class="layui-form-item">
	    <label class="layui-form-label">单位地址</label>
	    <div class="layui-input-block">
	      <input type="text" name="ucompanyAddr" value="${userInfo.ucompanyAddr }" disabled="disabled" class="layui-input">
	    </div>
  	</div>
	<div class="layui-form-item">
	    <label class="layui-form-label">家庭地址</label>
	    <div class="layui-input-block">
	      <input type="text" name="uhomeAddr" value="${userInfo.uhomeAddr }" disabled="disabled" class="layui-input">
	    </div>
  	</div>
  	<div class="layui-form-item">
	  <div class="layui-input-block">
	    <button type="button" class="layui-btn self-back-btn">返回</button>
	  </div>
	</div>
</div>
<script type="text/javascript" src="<%=basePath %>/scripts/layerui/layui.js"></script>
<script type="text/javascript" src="<%=basePath %>/scripts/jquery.js"></script>
<script type="text/javascript">
$(".self-back-btn").click(function(){
	window.history.go(-1);
});
</script>
</body>
</html>