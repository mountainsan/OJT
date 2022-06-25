package com.san.OJT.Join;

import com.san.OJT.DTO.Membership;
import com.san.OJT.IDAO.JoinIDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

// Controller 패키지와 잘 호환되고 있는지 확인 할것.

// idao 연결때문에 만든 경로지정



//인터페이스와 연결
@Service
public class JoinServ implements JoinInterface{
    // get logger
    private static final Logger logger = LoggerFactory.getLogger(JoinServ.class);

    // IDAO 가져오기 :IDAO
    @Autowired public JoinIDAO joinidao;


    //controller 에서 DTO 받음
    @Override
    public void joinProc(Membership membership) {

        //IDAO로 DTO 전달
        joinidao.joinProc(membership);
    }

    //2. ID 중복확인 동작
    @Override
    public String isExistIDConfirm(HttpServletRequest jspValue){
        // jsp에서 사용자 입력값 가져오기
        String userID = jspValue.getParameter("id");

        // DB에서 search한 값 가져오기-- !! 수정해야 함 !!
        int DBCheck = joinidao.DBCheck(userID);

        // 분기 생성
        if(DBCheck==1){
            logger.warn("중복된 ID 존재");
            return "F";
        }
        else{
            logger.warn("중복된 ID 없음");
            return "T";
        }
    }

//3. 인증번호 받기 버튼 동작-> 인증번호 생성
    @Override
    public String authSend() {
        String authNumber ="1234";
        logger.warn("인증번호 생성");
        return authNumber;
    }

// 4. 인증버튼 확인버튼 동작 -> comfirm 값 T 또는 F 를 controller에 반환
    @Override
    public String authCkConfirm(HttpServletRequest jspValue) {

        //jsp에서 사용자 입력값 가져오기
        String authUserNum= jspValue.getParameter("authUserNum");
        // serv에서 생성된 인증번호 가져오기
        String authNumber = authSend();

        // 분기 생성
        if(authUserNum.equals(authNumber)){
            logger.warn("일치하는 인증번호");
            return "T";
        }
        else {
            logger.warn("일치하지 않는 인증번호");
            return "F";
        }
//5. 패스워드 일치 확인
    }

}
