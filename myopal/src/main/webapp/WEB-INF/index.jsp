<%--
  Created by IntelliJ IDEA.
  User: dongsidou
  Date: 2016/7/17
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path = request.getContextPath(); %>
<html>
<head>
    <title>组织过程资产库工具</title>
    <!-- Custom Theme files -->
    <script src="<%=path %>/scripts/jquery-2.1.4.js"></script>
    <script src="<%=path %>/scripts/bootstrap.min.js"></script>
    <script src="<%=path %>/scripts/jquery.validate.min.js"></script>
    <script src="{<%=path %>/scripts/jquery.validate.expand.js"></script>
    <script src="<%=path %>/scripts/messages_zh.min.js"></script>
    <link rel="stylesheet" href="<%=path %>/styles/bootstrap.min.css">
    <link rel="stylesheet"	href="<%=path %>/styles/common.css" />
    <link href="<%=path %>/styles/login.css" rel="stylesheet" />

</head>
<body>
<div class="title">
    <h2>组织过程资产库管理工具</h2>
</div>
<form name="loginForm" action="/myopal/userController/login" method="post">
    <div class="signup">
        <span class="ribben"></span>
        <p>
            用户名：<span class="dot"> </span>
        </p>
        <input type="text" name="name" placeholder="example"/>
        <p>
            密码：<span class="dot"> </span>
        </p>
        <input type="password" name="password">
        <a class="btn btn-primary" role="button" href="javascript:document.loginForm.submit();">登录</a>
        <a role="button" class="btn btn-primary" data-toggle="modal" data-target="#userRegisterModal">用户注册</a>

        <p>
        <h3>${errormessage}</h3>
        </p>

    </div>
</form>
<div class="copyright">
    <p>北航软件所 版权所有 @2015</p>
    <p>公司地址：北京市海淀区学院路37号</p>
    <p>电话：010－82318974</p>

</div>




<!-- Modal for user register -->
<div class="modal fade" id="userRegisterModal" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close"
                        data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    用户注册
                </h4>
            </div>
            <div class="modal-body">
                <form name="registerform" action="/myopal/userController/userRegister" method="post">
                    <div class="register">
                        <span class="ribben"></span>
                        <p>
                            用户名：<span class="dot"> </span>
                        </p>
                        <input type="text" name="user.name" placeholder="example"/>
                        <p>
                            密码：<span class="dot"> </span>
                        </p>
                        <input type="password" name="user.password">
                        <p>
                            姓名：<span class="dot"> </span>
                        </p>
                        <input type="text" name="user.username">
                        <p>
                            邮箱：<span class="dot"> </span>
                        </p>
                        <input type="email" name="user.email">

                        <div class="modal-footer">
                            <a class="btn btn-primary" role="button" href="javascript:document.registerform.submit();">提交</a>
                        </div>

                    </div>
                    </form>

        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
    </div>
</div>
</body>
</html>
