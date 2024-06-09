<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 내장 객체 request 사용해보기 -->
<ul>
	<li><%= request.getRequestURL() %> </li>
	<li><%= request.getProtocol() %> </li>
</ul>