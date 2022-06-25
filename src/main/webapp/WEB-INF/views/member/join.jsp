<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="urlHome" value="/"/>




<html>
<body>
<center>
<h4><font color="black">
회원가입 페이지 입니다.<br>
정확한 인증번호를 입력하셔야 가입이 완료됩니다.</h4>

<h4><font color="black">
-------------- 시스템 메시지 --------------</h4>
<h3><font color="red">${sysMsg} </h3>
<h4><font color="black">
---------------------------------------------</h4>
<form action = "${urlHome}join/joinProc" method ="post">

<table>
    <tr>
        <td colspan="4" align="center"> <hr/>필수 입력 사항<hr/> </td>  </tr>


    <tr>
    <td align='left' height=40> 아이디 </td>
<!--DTO 생성후 value 연결할 것 -->
    <td><input type=text  style="width:96%;" name='id' placeholder='ID를 입력하세요' value = "${id}"/> </td>
    <td colspan="left" ><button formaction="${urlHome}join/isExistID"> ID 중복 확인 </button></td>
    </tr>

    <tr>
    <td align='left'> 패스워드 </td>
    <td colspan="3"><input type= text style="width:60%;" name='pw' placeholder='Password를 입력하세요' value="${pw}" />  </td>
 </tr>
 <tr>
    <td align='left'> 패스워드 재확인</td>
    <td colspan="3"><input type=text style="width:60%;" name='pwCheck' placeholder='한번 더 입력하세요' value="${pwCheck}"/> </td>

    </tr>

    <tr>
    <td align ='left'> 인증번호 </td>
    <!--인증번호는 여기로 띄우면 좋을듯 -->
    <td> <input type=text style="width:96%;" name='authUserNum' placeholder='인증번호를 입력해주세요' value="${authUserNum}"</td>
    <td colspan="2"><button formaction="${urlHome}join/authSend"> 인증번호 받기</button> </td>

    <td colspan="2"><button formaction="${urlHome}join/authCheck"> 인증번호 확인</button> </td>
    </tr>

    <tr>
    <td colspan="4" align="center"> <hr/>선택사항<hr/> </td>  </tr>


    <tr> <td align ='left' width=200> 직군을 선택하세요 </td> <br>
    <td colspan="4">

     <input type=radio name='job' value ='non' checked="checked"/> 비밀입니다 <br>
     <input type=radio name='job' value = 'dev' /> 개발자 developer <br>
     <input type=radio name='job' value = 'devNdi' /> 디발자 developer & designer<br>
     <input type=radio name='job' value = 'diNdev' /> 개자이너 designer & developer<br>
     <input type=radio name='job' value = 'di' /> 디자이너 designer<br>
</td>
</tr>

    <tr>
    <td align='center' height=40 colspan=4>
    <input type=submit value='회원가입하기' style="width:120px;" /> <br> <br>
    <input type=reset value='회원가입 취소' style="width:120px;" />

    </td>
    </tr>


</table>
</form>
</center>
</body>
</html>
