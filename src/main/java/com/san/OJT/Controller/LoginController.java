package com.san.OJT.Controller;

import com.san.OJT.Login.LoginInterface;
import com.san.OJT.Login.LoginServ;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value="login")
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    //컨트롤러로 인터페이스 가져오기 : interF
    @Autowired private LoginInterface interF;

    @RequestMapping(value = "/loginProc")
    public String loginProc(Model model, HttpServletRequest jspValue){

        //정상동작 확인
        //model.addAttribute("sysMsg", "시스템메시지 출력 테스트");

        // service에서 값 비교 한 값 받아와서 jsp의 Msg로 전달

        // jsp에서 값 가져와서 serv->DB
        String inputID = jspValue.getParameter("inputID");
        String inputPW = jspValue.getParameter("inputPW");

        // Serv에서 가져온 confirm 값

        String loginProcConfirm = interF.loginProcConfirm(jspValue);


        if(loginProcConfirm == "confirm") {
            //로그인 성공
            model.addAttribute("sysMsg", "로그인이 완료되었습니다.");
            logger.warn("로그인 성공");

            //실패 사례 모음
            // 공백(2) , 불일치(2)
        } else if (loginProcConfirm =="wrongPW") {
            model.addAttribute("sysMsg","잘못된 패스워드 입니다.");
            // 사용자 입력값 재 리턴
            model.addAttribute("inputID",jspValue.getParameter("inputID"));
            model.addAttribute("inputPW",jspValue.getParameter("inputPW"));

            logger.warn("로그인 실패 : 잘못된 패스워드");

        } else if (loginProcConfirm =="wrongID") {
            model.addAttribute("sysMsg", "존재하지 않는 아이디입니다.");

            // 사용자 입력값 재 리턴
            model.addAttribute("inputID",jspValue.getParameter("inputID"));
            model.addAttribute("inputPW",jspValue.getParameter("inputPW"));

            logger.warn("로그인 실패: 잘못된 아이디");

        } else if (inputID=="" && inputPW == "") {
            model.addAttribute("sysMsg", "로그인 정보를 입력해주세요.");
            // 사용자 입력값 재 리턴
            model.addAttribute("inputID",jspValue.getParameter("inputID"));
            model.addAttribute("inputPW",jspValue.getParameter("inputPW"));

            logger.warn("로그인 실패 : 모든 공백");


        }else if(inputPW == ""){
            model.addAttribute("sysMsg", "패스워드를 입력해야 합니다.");
            // 사용자 입력값 재 리턴
            model.addAttribute("inputID",jspValue.getParameter("inputID"));
            model.addAttribute("inputPW",jspValue.getParameter("inputPW"));

            logger.warn("로그인 실패 : 패스워드 공백");

        }else if(inputID==""){
            model.addAttribute("sysMsg", "아이디를 입력해야 합니다.");
            // 사용자 입력값 재 리턴
            model.addAttribute("inputID",jspValue.getParameter("inputID"));
            model.addAttribute("inputPW",jspValue.getParameter("inputPW"));

            logger.warn("로그인 실패: 아이디 공백");

        }
        logger.warn("loginProc 동작");

        return "member/login";
    }







}
