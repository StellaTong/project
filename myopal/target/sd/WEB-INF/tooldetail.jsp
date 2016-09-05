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

            <h4 class="modal-title" id="myModalLabel">工具信息</h4>
        </div>


            <form class="form-horizontal" name="toolForm" id="toolForm"
                  action="/myopal/tool/edit/${tool.toolid}" method="post" >
                <div class="modal-body">
                    <div class="form-group">
                        <label for="toolname" class="col-sm-3 control-label">工具名称</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="toolname"
                                   name="toolname"
                                   value="${tool.toolname}" />
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="processid" class="col-sm-3 control-label">所属过程域</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="processid"
                                   name="processid"
                                   value="${tool.processid}" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="tooldes" class="col-sm-3 control-label">描述</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="tooldes"
                                   name="tooldes"
                                   value="${tool.tooldes}" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="url" class="col-sm-3 control-label">链接</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="url"
                                   name="url"
                                   value="${tool.url}" />
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
                        $("#toolEditModal").modal('hide');
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
                            "toolname":"required",
                            "processid":"required",
                            "url":"required",
                            "tooldes":"required",

                        }
                    });

                });





            </script>


