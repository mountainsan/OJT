package com.san.OJT.Login;

import com.san.OJT.IDAO.JoinIDAO;
import com.san.OJT.IDAO.LoginIDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


// Controller 패키지와 잘 호환되고 있는지 확인 할것.

@Service
public class LoginServ implements LoginInterface {
    private static final Logger logger = LoggerFactory.getLogger(LoginServ.class);

    @Autowired private HttpSession session;

    //IDAO 가져오기 : idao
    @Autowired public JoinIDAO idao;


    // CLASS 시작

    @Override
    public String loginProcConfirm(HttpServletRequest jspValue) {
// jsp 내의 사용자 입력값
        String inputID = jspValue.getParameter("inputID");
        String inputPW = jspValue.getParameter("inputPW");

        // DB에서 확인한 값 가져오기
        int DBckID = idao.DBckID(inputID);
        int DBckPW = idao.DBckPW(inputPW);
        int loginConfirm = idao.loginConfirm(inputID,inputPW);

//  값 비교후 interf로 전송


        // 로그인 성공 
        if(loginConfirm ==1){
            return "confirm";
            
        // 아이디 존재    
        } else if (DBckID ==1 && DBckPW ==0 ) {
            return "wrongPW";

        // 비번 존재
        } else if (DBckPW ==1 && DBckID ==0) {
            return "wrongID";
        }

        logger.warn("loginProcConfirm 동작");

        return "";

    }


}
