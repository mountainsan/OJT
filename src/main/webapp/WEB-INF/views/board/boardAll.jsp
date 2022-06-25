<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="urlHome" value="/"/>



<html>
<body>
<center>


<form id="frm" action="${urlHome}board/write" method="post">
<input type="hidden" id="writeNo" name="writeNo"/>


<table style="width: 650px;">
<!-- 상단 행 시작 -->
	<thead>
	<tr>
		<th style="width: 40px; height:20px;" align="center">선택</th>
		<th style="width: 330px; height:20px;" align="center">제 목</th>
		<th style="width: 80px; height:20px;" align="center">작성자</th>
		<th style="width: 120px; height:20px;" align="center">작성일</th>
		<th style="width: 80px; height:20px;" align="center">조회수</th>
	</tr>
	</thead>
<!-- 상단 행 끝 -->
	<tr>
		<td style="width: 40px; height:20px;" align="center"><hr/></td>
		<td style="width: 330px; height:20px;" align="center"><hr/></td>
		<td style="width: 80px; height:20px;" align="center"><hr/></td>
		<td style="width: 120px; height:20px;" align="center"><hr/></td>
		<td style="width: 80px; height:20px;" align="center"><hr/></td>
	</tr>

<!-- boardAll 내역 시작  -->
	<c:forEach var="board" items="${boardLst }">
	<tr>
		<td style="width: 40px; height:40px;" align="center">
		<input class="chkbox" type="checkbox" name="chkbox" value="${board.no }"/></td>
		<td style="width: 330px; height:40px;" align="left"><div class="title" id="${board.no }"> <pre>${board.title }</pre></div></td>
		<td style="width: 80px; height:40px;" align="center">${board.id }</td>
		<td style="width: 120px; height:40px;" align="center">${board.writedate }</td>
		<td style="width: 80px; height:40px;" align="center">1</td>
	</tr>
	</c:forEach>

<!-- boardAll 내역 끝  -->

<!-- 하단 컨트롤러 시작  -->
	<tr><td colspan=5><hr/></td></tr>
	<tr>
		<td colspan=2><input id="allSelect" type="checkbox"/>전체선택</td>

		<td colspan=3 align="right">
			<!-- <input type="button" value='삭제' style="width: 100px; "/> -->
			<button formaction="${urlHome }board/delete" style="width: 100px; ">삭제</button>

			<button formaction="${urlHome}board/write" style="width: 100px;">글쓰기</button>
		</td>
	</tr>

<!-- 하단 컨트롤러 끝  -->

	<tr><td colspan=5><hr/></td></tr>
</table>
</form>
<!-- 1테이블 1폼 액션 끝  -->

<!-- 내비 시작 -->

<!-- 이전 1 2 3 4 다음<br/> -->
${navi }
<!-- 내비 끝 -->

<!-- 검색 bar 시작 -->
<table>
<tr>
<td>


<form action="${urlHome }board/search">
 <!-- 검색 bar 분류 select tap -->
	<select name="searchName">
		<option value="all">전체</option>
		<option value="title">제목</option>
		<option value="id">작성자</option>
	</select>

	<input type="text" name="searchWord"/>

	<!-- 검색 button -->
	<input type="submit" name='searchBtn' value='검색' style="width: 80px; "/>

</form>
<!-- 검색 bar 끝 -->

</td>
</tr>
</table>


</center>
</body>
</html>
