<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<base href="<%=basePath%>">
<title>组织过程资产库</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<!-- Custom Theme files -->
<script src="<%=path %>/scripts/jquery-2.1.4.js"></script>
<script src="<%=path %>/scripts/bootstrap.min.js"></script>
<script src="<%=path %>/scripts/jquery.validate.min.js"></script>
<script src="<%=path %>/scripts/jquery.validate.expand.js"></script>
<script src="<%=path %>/scripts/messages_zh.min.js"></script>
<link rel="stylesheet" href="<%=path %>/styles/bootstrap.min.css">
<link rel="stylesheet" href="<%=path %>/styles/common.css" />
<link rel="stylesheet" href="<%=path %>/styles/index.css" />
<style>
a#backIndex{
float:right;
background:none;
}
</style>