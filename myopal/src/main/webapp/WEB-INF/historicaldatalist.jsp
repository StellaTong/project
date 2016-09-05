
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
        <h3>历史数据列表</h3>
           <a id="historicaldataadd"  href="/myopal/historicaldata/empty" role="button"
              data-toggle="modal" data-target="#historicaldataEditModal"><span class="glyphicon glyphicon-plus-sign"></span></a>
           <table class="table table-bordered" id="historicaldatatable">
            <thead>
            <tr>
                <th>数据记录id</th>
                <th>度量项名称</th>
                <th>所属项目</th>
                <th>数据值</th>
                <th>修改</th>
                <th>删除</th>


            </tr>
            </thead>
            <tbody>
            <c:forEach var="historicaldata" items="${historicaldatalist}">
                <tr>
                    <td><a href="/myopal/historicaldata/detail/${historicaldata.recordid}">${historicaldata.recordid}</a></td>
                    <td>${historicaldata.metricname}</td>
                    <td>${historicaldata.projectid}</td>
                    <td>${historicaldata.value}</td>


                    <td><a href="/myopal/historicaldata/detail/${historicaldata.recordid}" type="button" data-toggle="modal" data-target="#historicaldataEditModal">
                        <span class="glyphicon glyphicon-edit"></span>
                    </a></td>
                    <td><a href="/myopal/historicaldata/delete/${historicaldata.recordid}">
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
<div id="historicaldataEditModal" class="modal fade" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
        </div>
    </div>
</div>
<script>

    $('#historicaldataEditModal').on('hide.bs.modal', function(e) {
        $(this).removeData("bs.modal");
    });
</script>

<%@ include file="common/layout/footer.jsp"%>
