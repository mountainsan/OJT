package com.san.OJT.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    // 실행 확인용 logger import
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    // URL 생성

    @RequestMapping(value = "/")
    public String home(){
        logger.warn("홈 페이지 입장");
        return "home";
    }

    // 헤더버튼으로 값 전달
    //@RequestMapping(value="/home")
    //public String index(Model model,
      //                  @RequestParam("contents") String contents){


        //logger.warn("인덱스로 값 연결");
        //return "include/header";
    //}

    // URL 생성

    @RequestMapping(value = "/login")
    public String login(){

        logger.warn("로그인 페이지 입장");
        return "member/login";
    }


    @RequestMapping(value = "join")
    public String join(){
        logger.warn("회원가입 페이지 입장");
        return "member/join";
    }

    @RequestMapping(value = "board")
    public String boardAll(){
        logger.warn("게시판 뷰페이지 입장");
        return "board/boardAll";
    }


    // 로그아웃은 세션 적용 후에 구현

    @RequestMapping(value = "/logout")
    public String logout(){

        logger.warn("로그아웃 페이지 입장");
        return "member/logout";
    }
    @RequestMapping(value = "/logout/logoutProc")
    public String logoutProc(Model model){

        model.addAttribute("sysMsg", "로그아웃 되었습니다.");

        logger.warn("로그아웃 완료");
        return "member/logout";
    }





}
