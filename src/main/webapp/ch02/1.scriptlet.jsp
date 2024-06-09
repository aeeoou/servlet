<!-- 디렉티브 문법 -->
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!-- scriptlet문법 'Java'코드 작성 -->
<%
	int num1 = 12;
	int num2 = 32;
%>

<!-- scriptlet 바깥에는 'HTML'코드를 작성한다. -->
<h4> 스크립트립 바깥에는 HTML코드를 작성한다. </h4>

<!-- Expression문법 = scriptlet 의 변수 값을 쓰고 싶을 때 expression 안에 작성한다. -->
<%= num1 %> <br>
<%= num1 %> + <%= num2 %> = <%= num1 + num2 %>






<!--
Servlet 으로 페이지를 만들 때는 Java코드가 메인, HTML코드가 서브
JSP 로 페이지를 만들 때는 HTML코드가 메인, Java코드가 서브
 -->