<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
[
<c:forEach var="a" items="${data }" varStatus="status">
<c:if test="${!status.first }">,</c:if>
{num:${a.num }, name:'${a.name }', content:'${a.content }'}
</c:forEach>
]