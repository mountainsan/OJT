<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="urlHome" value="/"/>

<html>
<body>
<center>
<h4><font color="black">로그인페이지 입니다.</h4>

<h4><font color="red">${sysMsg} </h4> <br>
<form action ="${urlHome}login/loginProc" method="post">
<table>
    <tr>
        <td><br>아이디</td>
        <td> <br><input type=text name='inputID' placeholder='ID입력'/> </td><br>
    </tr>

    <tr>
        <td><br>패스워드</td>
        <td> <br><input type=password name='inputPW' placeholder='PW입력'/> </td><br>
    </tr>

    <tr>
        <td colspan=2 align='center'>
            <br><input type=submit value='로그인 실행' style="width: 86px;"/><br>
           <br> <input type=reset value='로그인 취소' style="width: 86px;" /><br>

        </td>
    </tr>
</table>
</form>
</center>
</body>
</html>

<!--form 이 전체를 감쌀지 테이블만 감쌀지 확실하지 않음 -->
