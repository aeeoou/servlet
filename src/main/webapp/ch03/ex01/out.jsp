<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 내장 객체 out을 사용해보자 -->
<%
	for(int i = 0; i < 10; i++) {
		out.print(i + "&nbsp;");
	}
%>