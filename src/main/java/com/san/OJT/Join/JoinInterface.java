package com.san.OJT.Join;

import com.san.OJT.DTO.Membership;

import javax.servlet.http.HttpServletRequest;

public interface JoinInterface {


    void joinProc(Membership membership);

    //2. ID 중복확인 동작
    String isExistIDConfirm(HttpServletRequest jspValue);

    String authSend();


    // 4. 인증버튼 확인버튼 동작 -> comfirm 값 T 또는 F 를 controller에 반환
    String authCkConfirm(HttpServletRequest jspValue);

}
