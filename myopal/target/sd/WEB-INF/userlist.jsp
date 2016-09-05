
<!-- 引入jstl -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="common/layout/commonInclude.jsp"%>
<div id="wrap">
    <%@ include file="common/layout/sysAdmin_head.jsp"%>
    <%@ include file="common/layout/sysAdmin_sidebar.jsp"%>
        <%@ page language="java" contentType="text/html; charset=UTF-8"
                 pageEncoding="UTF-8"%>
        <link rel="stylesheet" href="<%=path %>/styles/bootstrap-switch.min.css" />
        <script src="<%=path %>/scripts/rowspan.js"></script>
        <script type="text/javascript" src="<%=path %>/scripts/jquery-2.1.4.js"></script>

    <div id="content-wrap">
       <div id="userList">
        <h3>用户列表</h3>
           <a id="useradd"  href="/myopal/userController/emptyuser" role="button"
              data-toggle="modal" data-target="#userEditModal"><span class="glyphicon glyphicon-plus-sign"></span></a>
           <table class="table table-bordered" id="user_table">
            <thead>
            <tr>
                <th>用户Id</th>
                <th>用户账号</th>
                <th>用户名</th>
                <th>用户类型</th>
                <th>邮箱</th>
                <th>修改</th>
                <th>删除</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach var="user" items="${userlist}">
                <tr>
                    <td >${user.id}</td>
                    <td><a href="/myopal/userController/showuser/${user.id}" data-toggle="modal" data-target="#userEditModal">${user.username}</a></td>
                    <td>${user.name}</td>
                    <td>${user.usertype}</td>
                    <td>${user.email}</td>
                    <td><a href="/myopal/userController/showuser/${user.id}" type="button" data-toggle="modal" data-target="#userEditModal">
                        <span class="glyphicon glyphicon-edit"></span>
                    </a></td>
                    <td><a href="/myopal/userController/userDeleteById/${user.id}">
                        <span class="glyphicon glyphicon-trash"></span>
                    </a></td>
                </tr>
            </c:forEach>
            </tbody>

        </table>
      </div>
    </div>
    </div>
        <!-- Modal for user register -->
<!-- Modal for user register -->
<!-- Modal for create project-->
<div id="userEditModal" class="modal fade" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
        </div>
    </div>
</div>
<script>

    $('#userEditModal').on('hide.bs.modal', function(e) {
        $(this).removeData("bs.modal");
    });
</script>

<%@ include file="common/layout/footer.jsp"%>
