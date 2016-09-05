<%--
  Created by IntelliJ IDEA.
  User: dongsidou
  Date: 2016/7/17
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>

<%@ include file="common/layout/commonInclude.jsp"%>
<div id="wrap">
    <%@ include file="common/layout/sysAdmin_head.jsp"%>
    <%@ include file="common/layout/sysAdmin_sidebar.jsp"%>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
             pageEncoding="UTF-8"%>
    <div id="content-wrap">
        <h3 class="welcome">hello:${loginuser.name}</h3>
    </div>
</div>
<%@ include file="common/layout/footer.jsp"%>



