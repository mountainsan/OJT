<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="urlHome" value="/"/>

<!--JQuery script -->
<%--
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("button#modify").click(function(){
		$("input[name=pno]").attr("name", "modify")
		$("input[name=modify]").val("true")
		$("#opt").attr("name", "modify")
		$("#opt").val("true")
	})
	$("#write").click(function(){
		$("input[name=no]").val("0")
		$("input[name=title]").val("")
		$("input[name=contents]").val("")
	})
})
</script>
 --%>

<!-- 뷰 시작-->
<html>
<body>

<center>
<form action="${urlHome }board/write">
<input type="hidden" id="opt" name="pno" value="${board.no }">
<input type="hidden" name="no" value="${board.no }">
<input type="hidden" name="title" value="${board.title }">
<input type="hidden" name="contents" value="${board.contents }">
<table style="width: 650px;">
	<tr>
		<td style="width: 300px; height: 40px;" valign="middle"><h2>${board.title }</h2></td>
		<td style="width: 350px; height: 40px;" align="right" valign="bottom">${board.writedate }</td>
	</tr>
	<tr>
		<td colspan=2><hr /></td>
	</tr>
	<tr>
		<td style="width: 300px; height: 40px;" valign="top">${board.id }</td>
		<td style="width: 350px; height: 40px;" align="right" valign="top">
			<a href="${home }resources/upload/${attachFileMap.SYSTEMFILE }">${attachFileMap.ORIGINFILE }</a>
		</td>
	</tr>
	<tr>
		<td colspan=2 style="width: 650px; height: 300px" valign="top">
			<pre>
${board.contents }
	</pre>
		</td>
	</tr>
	<tr>
		<td colspan=2><hr /></td>
	</tr>
	<tr>
		<td colspan=2 align="right">
			<button id="write" style="width: 60px;">글쓰기</button>
			<button formaction="${urlHome }board/reply" style="width: 60px;">답글</button>
			<button formaction="${urlHome }board/modify" style="width: 60px;">수정</button>
			<button formaction="${urlHome }board/delete" style="width: 60px;">삭제</button>
			<button formaction="${urlHome }board/boardProc" style="width: 60px;">목록</button>
		<!--
		<input type=button style="width: 60px; " value='글쓰기'/>
		<input type=button style="width: 60px; " value='답글'/>
		<input type=button style="width: 60px; " value='수정'/>
		<input type=button style="width: 60px; " value='삭제'/>
		<input type=button style="width: 60px; " value='목록'/>
		-->
		</td>
	</tr>
</table>
</form>
</center>






</body>
</html>