package com.san.OJT.Controller;

import com.san.OJT.DTO.Membership;
import com.san.OJT.Join.JoinInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "join")
public class JoinController {
    private static final Logger logger = LoggerFactory.getLogger(JoinController.class);

    // 0.컨트롤러로 인터페이스 가져오기 : interF
    @Autowired private JoinInterface interF;

// Interface로 부터 T 또는 F만 받음.
    // T일 때 값전달과 sysMsg에 정상 메시지 전달
    // F일 때 sysMsg에 해당 에러 메시지 전달

// 1.회원가입하기 버튼 동작-> DB로 3개의 값 전달
    @RequestMapping(value="joinProc")
    public String JoinProc(Model model, HttpServletRequest jspValue,Membership membership ){

//Serv에서 confirm 한 값 가져오기
        String isExistIDConfirm = interF.isExistIDConfirm(jspValue);
        String authCkConfirm = interF.authCkConfirm(jspValue);
// 패스워드 입력값 가져오기

        String pw = jspValue.getParameter("pw");
        String pwck = jspValue.getParameter("pwCheck");

// 모든 값이 T일 때,
        //model.addAttribute()
        if(isExistIDConfirm == "T" && authCkConfirm== "T" && pw==pwck){
// 회원가입 완료 메시지 전달
            model.addAttribute("sysMsg","회원가입이 완료되었습니다.");
//DB로 값 3개 전달 : DTO 가져와서 interface로 보냄
            interF.joinProc(membership);

// 패스워드 재확인
        } else if(pw!=pwck){

           model.addAttribute("sysMsg", "패스워드 입력값이 일치하지 않습니다.");
            // 사용자 입력값 재 리턴
            model.addAttribute("id",jspValue.getParameter("id"));
            model.addAttribute("pw",jspValue.getParameter("pw"));
            model.addAttribute("pwCheck",jspValue.getParameter("pwCheck"));
            model.addAttribute("authUserNum",jspValue.getParameter("authUserNum"));

        } else{
            model.addAttribute("sysMsg","모든 필수사항을 완료하여야 합니다.");
            // 사용자 입력값 재 리턴
            model.addAttribute("id",jspValue.getParameter("id"));
            model.addAttribute("pw",jspValue.getParameter("pw"));
            model.addAttribute("pwCheck",jspValue.getParameter("pwCheck"));
            model.addAttribute("authUserNum",jspValue.getParameter("authUserNum"));
        }

        logger.warn("JoinProc 동작");
        return "member/join";
    }
    // interface에서 처리한 값 가져오기
    // @Autowired private id중복결과 =interF.T/F가 들어있는 메소드;

//2. ID 중복확인 동작
    @RequestMapping(value = "isExistID")
    public String isExistID(Model model, HttpServletRequest jspValue){

        //Serv에서 confirm 한 값 가져오기
        String isExistIDConfirm = interF.isExistIDConfirm(jspValue);

        // 분기생성
        if(isExistIDConfirm == "T"){
            model.addAttribute("sysMsg","사용할 수 있는 아이디입니다.");
        }else{
            // 오류메시지 전달
            model.addAttribute("sysMsg","이미 존재하는 아이디입니다.");
        }

        // 사용자 입력값 재 리턴
        model.addAttribute("id",jspValue.getParameter("id"));

        logger.warn("ID 중복확인 버튼 동작");
        return "member/join";
    }


//3. 인증번호 받기 버튼 동작
    @RequestMapping(value = "authSend")
    public String authSend(Model model, HttpServletRequest jspValue){
        // Serv에서 생성한 번호 sys로 전송
        //재선언 안해도 된다. 하지만 4번에서 필요해서 했다.
        String authNum = interF.authSend();
        model.addAttribute("sysMsg","인증번호는 "+authNum+" 입니다.");

        // 사용자 입력값 재 리턴
        model.addAttribute("id",jspValue.getParameter("id"));
        model.addAttribute("pw",jspValue.getParameter("pw"));
        model.addAttribute("pwCheck",jspValue.getParameter("pwCheck"));

        return "member/join";
    }


// 4. 인증번호 확인 버튼 동작
    @RequestMapping(value = "authCheck")
    public String authCheck(Model model, HttpServletRequest jspValue){

        //Serv 에서 체크한 confirm 값 가져오기
        String authCkConfirm = interF.authCkConfirm(jspValue);

        if(authCkConfirm=="T"){
            // serv에서 값 비교후 return 한 값이 T일경우
            model.addAttribute("sysMsg", "인증이 완료되었습니다.");
        }
        else{
            // F일 경우
            model.addAttribute("sysMsg", "잘못된 인증번호 입니다.");
        }
        // 사용자 입력값 재 리턴
        model.addAttribute("id",jspValue.getParameter("id"));
        model.addAttribute("pw",jspValue.getParameter("pw"));
        model.addAttribute("pwCheck",jspValue.getParameter("pwCheck"));
        model.addAttribute("authUserNum",jspValue.getParameter("authUserNum"));

        return "member/join";
    }







}
