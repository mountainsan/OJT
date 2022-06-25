<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="urlHome" value="/"/>

<html>
<body>
<center>
<h4><font color="black">지금 로그아웃 하시겠습니까?</h4>

<h4><font color="red">${sysMsg} </h4> <br>
<form action ="${urlHome}logout/logoutProc" method="post">
<table>

    <tr>
        <td colspan=2 align='center'>
            <br><input type=submit value='네, 로그아웃 할게요' style="width: 200px;"/><br>
           <br> <input type=reset value='홈으로 돌아가기' style="width: 200px;" /><br>

        </td>
    </tr>
</table>
</form>
</center>
</body>
</html>