
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
        <h3>过程性能基线列表</h3>
           <a id="ppbadd"  href="/myopal/ppb/empty" role="button"
              data-toggle="modal" data-target="#ppbEditModal"><span class="glyphicon glyphicon-plus-sign"></span></a>
           <table class="table table-bordered" id="ppbtable">
            <thead>
            <tr>
                <th>基线Id</th>
                <th>基线名称</th>
                <th>度量项名称</th>
                <th>下限值（LCL）</th>
                <th>均值（CL）</th>
                <th>上限值（UCL）</th>
                <th>修改</th>
                <th>删除</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach var="ppb" items="${ppblist}">
                <tr>
                    <td><a href="/myopal/ppb/detail/${ppb.ppbid}">${ppb.ppbid}</a></td>
                    <td>${ppb.ppbname}</td>
                    <td>${ppb.metricname}</td>
                    <td>${ppb.lcl}</td>
                    <td>${ppb.cl}</td>
                    <td>${ppb.ucl}</td>

                    <td><a href="/myopal/ppb/detail/${ppb.ppbid}" type="button" data-toggle="modal" data-target="#ppbEditModal">
                        <span class="glyphicon glyphicon-edit"></span>
                    </a></td>
                    <td><a href="/myopal/ppb/delete/${ppb.ppbid}">
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
<div id="ppbEditModal" class="modal fade" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
        </div>
    </div>
</div>
<script>

    $('#ppbEditModal').on('hide.bs.modal', function(e) {
        $(this).removeData("bs.modal");
    });
</script>

<%@ include file="common/layout/footer.jsp"%>
