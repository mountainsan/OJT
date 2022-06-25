<!--header.jsp-->

<!-- 기본 설정 1: 구현 -->
<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 기본 설정 2 : / 주소 기본값 설정
<c:url var="urlHome" value="/"/>
<!-- 로그인 구현 세션 설정 부분-->




<!-- 기본 설정 3 :css style -->
<style type="text/css">
<!--
a:link{color:black;font-family:sans-serif;text-decoration:none;}
a:visited{color:black;font-family:sans-serif;text-decoration:none;}
a:hover{color:#cc3300; font-weight:bold; }
a:active{color:#ff00cc; text-decoration:underline; }
-->
</style>

<!-- header 내용 시작 : table -->
<html>
<body>
<table align ="center" width = 1000>

<tr><td align ="center" colspan =5>   <a href = "${urlHome}" > <h1> Hello OJT </h1> </a> </td></tr>
<tr align ="right">
<td width=1600></td>

<!-- a 링크 -->
<td width=130> <a href = "${urlHome}" > 홈 </a></td>

<td width=150> <a href =  "${urlHome}login"  > 로그인 </a></td>

<td width=150> <a href ="${urlHome}join"> 회원가입 </a></td>

<td width=130> <a href ="${urlHome}board"> 게시판 </a></td>
<td width=150> <a href ="${urlHome}logout"> 로그아웃 </a></td>

</tr>


</table>
<hr/>
</body>

</html>



