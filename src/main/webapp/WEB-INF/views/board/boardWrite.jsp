<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="urlHome" value="/"/>

<c:set var="no" value="0"/>
<c:if test="${!empty board.no }">
	<c:set var="no" value="${board.no }"/>
</c:if>

<!-- 뷰 시작-->
<html>
<body>

<form action="${urlHome}board/write/writeProc" method="post" enctype="multipart/form-data">



<!-- 뷰 테이블 시작-->

<center>
글쓰기 페이지 입니다.
<table style="width: 650px; ">
<tr>
<td><input type="hidden" name="pno" value="${pno }"></td>
</tr>

<tr>
<td style="width: 80px; height:40px;" align="center">작성일</td>
<td><input type="text" name="date"  readonly="readonly"></td>
</tr>

<table style="width: 650px; ">
	<tr>
		<td style="width: 80px; height:40px;" align="center">작성자</td>
		<td style="width: 570px; height:40px;">
			<input type="text" name="id" />
			<!-- 세션으로 아이디 넣어줘야 함 / dto로 보드값 가져와야 함-->
		</td>
	</tr>
	<tr>
		<td  style="width: 80px; height:40px;" align="center">제 목</td>
		<td style="width: 570px; height:40px;">
			<input type=text name="title" style="width: 500px; "/>
		</td>
	</tr>
	<tr>
		<td colspan=2 align="right">
		<textarea name="contents" style="width: 650px; height: 300px"></textarea></td>
	</tr>

	<!--<tr>
		<td align='right' height=40 colspan=2>
			<input type=file name="uploadFile" style="width: 300px; "/>
		</td>
	</tr>-->

	<tr>
		<td align='center' height=40 colspan=2>
			<input type=submit value='글쓰기 완료' style="width: 120px; "/>
			<input type=reset value='취소' style="width: 120px; "/>
		</td>
	</tr>
</table>
</form>
</center>

</body>
</html>