<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	for(int i = 0; i < 10; i++) {
		out.print(i + "&nbsp;");
	}
%>

<!-- 과제 = 위 코드의 스파게티 코드라는 단점을 해결하라 (자바코드와 HTML코드를 분리) -->

<%
	for(int i = 0; i < 10; i++) {
%>

<%= i %> &nbsp;

<%
	}
%>