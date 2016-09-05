<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Header -->
<div id="header">
	<h1 id="logo">组织过程资产库工具</h1>
	<h2 id="slogan">欢迎使用组织过程资产库工具</h2>
	<div id="searchform">
		<form method="post" class="search" action="#">
			<p>
				<input name="search_query" class="textbox" type="text" /> 
				<input	name="search" class="button" type="submit" value="搜索" />
			</p>
		</form>
	</div>
</div>

<!-- menu -->
<div id="menu">
	<ul>
		<li ><a href="#">用户管理</a></li>
	    <li ><a href="#">修改密码</a></li>
		<li >
			<a href="#">组织级工作目录</a>
		</li>
		<li><a href="/myopal/project/projectlist">项目级工作目录</a></li>
	</ul>
	<div id="login-info">
		当前用户：${loginuser.name}&nbsp;&nbsp;
		用户类型：${loginuser.usertype}&nbsp;&nbsp;

		<a href="/myopal/userController/login">退出</a>
	</div>
</div>