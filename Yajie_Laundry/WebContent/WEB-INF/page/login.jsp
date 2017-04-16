<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
	String path = request.getContextPath();  
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;  
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta http-equiv="Cache-Control" content="no-siteapp" />
	<meta name="keywords" content="jieya">
	<meta name="description" content="洁雅干洗店">
    <title>登录-洁雅干洗店管理系统</title>
	<link href="<%=basePath %>/styles/login/layui/css/layui.css" rel="stylesheet" type="text/css"/>
	<link href="<%=basePath %>/styles/common/css/sccl.css" rel="stylesheet" type="text/css"/>
  </head>
  
  <body class="login-bg">
    <div class="login-box">
        <header>
            <h1>洁雅干洗店管理系统</h1>
        </header>
        <div class="login-main">
			<form id="loginForm"  class="layui-form">
				<div class="layui-form-item">
					<label class="layui-form-label">用户名</label>
				    <div class="layui-input-block">
				      <input id="loginname" type="text" name="loginname" lay-verify="loginname" placeholder="用户名" autocomplete="off" class="layui-input">
				    </div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">密码</label>
				    <div class="layui-input-block">
				      <input id="password" type="password" name="password" lay-verify="required" placeholder="密码" autocomplete="off" class="layui-input">
				    </div>
				</div>
				<div class="layui-form-item">
					<div class="layui-input-block">
					      <button type="button" class="layui-btn" lay-submit="" lay-filter="login">登陆</button>
					      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
				    </div>
					<div class="clear"></div>
				</div>
			</form>        
		</div>
        <footer>
            <p>镇沅县洁雅干洗店</p>
        </footer>
    </div>
    <script src="<%=basePath %>/styles/login/layui/layui.js"></script>
	<script type="text/javascript" src="<%=basePath %>/scripts/login/login.js"></script>
  </body>
</html>