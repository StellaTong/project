
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
        <h3>工具列表</h3>
           <a id="tooladd"  href="/myopal/tool/empty" role="button"
              data-toggle="modal" data-target="#toolEditModal"><span class="glyphicon glyphicon-plus-sign"></span></a>
           <table class="table table-bordered" id="tooltable">
            <thead>
            <tr>
                <th>工具Id</th>
                <th>工具名称</th>
                <th>描述</th>
                <th>修改</th>
                <th>删除</th>
                <th>参数设置</th>
                <th>转到</th>
                <th>打开本地工具</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach var="tool" items="${toollist}">
                <tr>
                    <td href="/myopal/tool/detail/${tool.toolid}">${tool.toolid}</td>
                    <td>${tool.toolname}</td>
                    <td>${tool.tooldes}</td>

                    <td><a href="/myopal/tool/detail/${tool.toolid}" type="button" data-toggle="modal" data-target="#toolEditModal">
                        <span class="glyphicon glyphicon-edit"></span>
                    </a></td>
                    <td><a href="/myopal/tool/delete/${tool.toolid}">
                        <span class="glyphicon glyphicon-trash"></span>
                    </a></td>
                    <td><a href="/myopal/tool/var/${tool.toolid}" type="button" data-toggle="modal" data-target="#toolEditModal">
                        <span class="glyphicon glyphicon-tag"></span>
                    </a></td>
                    <td><a href="/myopal/tool/search/${tool.toolid}">
                        <span class="glyphicon glyphicon-search"></span>
                    </a></td>
                    <td><a href="/myopal/tool/opensoftware/${tool.toolid}">
                        <span class="glyphicon glyphicon-search"></span>
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
<div id="toolEditModal" class="modal fade" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
        </div>
    </div>
</div>
<script>

    $('#toolEditModal').on('hide.bs.modal', function(e) {
        $(this).removeData("bs.modal");
    });
</script>

<%@ include file="common/layout/footer.jsp"%>
