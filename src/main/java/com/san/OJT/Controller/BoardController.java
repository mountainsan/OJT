//package com.san.OJT.Controller;
//
//import com.san.OJT.Board.BoardInterface;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Controller
//@RequestMapping(value = "board")
//public class BoardController {
//
//    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
//
//    //0. 인터페이스 가져오기 : interF
//
//    @Autowired private BoardInterface interF;
//
//    // String DATA 형식으로 serv에서 받아와서 삽입만 하는 형식으로 진행
//
//    // 게시글 작성 페이지
//
//    @RequestMapping(value = "write")
//    public String write(Model model, HttpServletRequest jspValue){
//        logger.warn("글쓰기 버튼 동작-게시글 작성 페이지 입장");
//        String writeDate = interF.writeDate();
//
//        //작성일 부여
//        model.addAttribute("date",writeDate);
//
//        return "board/boardWrite";
//    }
//
//
//    @RequestMapping(value ="write/writeProc")
//    public String writeProc(){
//        logger.warn("글쓰기 완료 버튼 동작");
//        // serv 에서 생성한 list 받아
//        return "board/boardWrite";
//    }
//
//    // 게시글 읽기 페이지
//    @RequestMapping(value = "view")
//    public String view(){
//        logger.warn("게시글 상세 읽기 페이지 입장");
//        return "board/boardView";
//    }
//
//
//}
