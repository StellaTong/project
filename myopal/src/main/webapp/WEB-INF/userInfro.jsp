<%--
  Created by IntelliJ IDEA.
  User: dongsidou
  Date: 2016/8/21
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<!-- 引入jstl -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%String path = request.getContextPath(); %>
<script src="<%=path %>/scripts/bootstrap-datetimepicker.min.js"></script>
<script src="<%=path %>/scripts/bootstrap-datetimepicker.zh-CN.js"></script>
<link rel="stylesheet" href="<%=path %>/styles/bootstrap-datetimepicker.min.css" />


        <div class="modal-header">

            <h4 class="modal-title" id="myModalLabel">用户信息</h4>
        </div>


            <form class="form-horizontal" name="userForm" id="userForm"
                  action="/myopal/userController/useredit/${user.id}" method="post" >
                <div class="modal-body">
                    <div class="form-group">
                        <label for="user.name" class="col-sm-3 control-label">姓名</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="user.name"
                                   name="user.name"
                                   value="${user.name}" />
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="user.username" class="col-sm-3 control-label">用户账号</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="user.username"
                                   name="user.username"
                                   value="${user.username}" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="user.password" class="col-sm-3 control-label">密码</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="user.password"
                                   name="user.password"
                                   value="${user.password}" />
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="user.usertype" class="col-sm-3 control-label">用户类型</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="user.usertype"
                                   name="user.usertype"
                                   value="${user.usertype}" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="user.email" class="col-sm-3 control-label">邮箱</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="user.email"
                                   name="user.email"
                                   value="${user.email}" />
                        </div>
                    </div>

              </div>


                <div class="modal-footer">
                    <input class="btn btn-primary" type="submit" value="确定" />
                    <input class="btn btn-primary" type="reset" value="重置" />
                </div>

            </form>
            <script>
                $.extend({
                    preventPost : function() {
                        event.preventDefault();
                        $("#userEditModal").modal('hide');
                    }
                });

                window.onload=function () {
                    $('body').on('hidden','.modal',function () {
                        $(this).removeData("modal")
                    })
                }


                $(document).ready(function(){
                    $("#userForm").validate({
                        rules: {
                            "user.name":"required",
                            "user.type":"required",
                            "user.password":"required",
                            "user.email":"required",

                        }
                    });

                });





            </script>


