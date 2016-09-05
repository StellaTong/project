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

            <h4 class="modal-title" id="myModalLabel">添加变量信息</h4>
        </div>


            <form class="form-horizontal" name="toolForm" id="toolForm"
                  action="/myopal/tool/addvartool" method="post" >
                <div class="modal-body">
                    <div class="form-group">
                        <label for="xmrname" class="col-sm-3 control-label">控制图名称</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="xmrname"
                                   name="xmrname" />
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="orgid" class="col-sm-3 control-label">所属组织</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="orgid"
                                   name="orgid"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="proid" class="col-sm-3 control-label">项目</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="proid"
                                   name="proi" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="xname" class="col-sm-3 control-label">横轴名</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="xname"
                                   name="xname"
                                  />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="yname" class="col-sm-3 control-label">纵轴名</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="yname"
                                   name="yname"
                            />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="metricname" class="col-sm-3 control-label">度量项名</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="metricname"
                                   name="metricname"
                            />
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


