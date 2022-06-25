//package com.san.OJT.Board;
//
//import com.san.OJT.IDAO.boardIDAO;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.servlet.http.HttpServletRequest;
//import java.sql.Date;
//
//@Service
//public class BoardServ implements BoardInterface {
//    //0.get logger
//    private static final Logger logger = LoggerFactory.getLogger(BoardServ.class);
//
//    //0-2. IDAO 가져오기 : iDAO
//    @Autowired public boardIDAO iDAO;
//
//    //1. 글쓰기 페이지 boardWrite.jsp 셋팅 board/write : serv->view->serv->DTO->idao->mapper 순으로 진행할 예정
//
//    @Override
//    public String writeDate(){
//        //1-1. 작성일 생성,  인터-뷰로 보냄
//        Date writeDate = new Date(System.currentTimeMillis());
//        logger.warn(String.valueOf(writeDate),"작성일 생성");
//        return String.valueOf(writeDate);
//        //1-3. 작성자 세션에서 받아와서 인터-뷰로보냄 (가장 마지막에 하기)
//    }
//
////-----------------------------------------------------------------------
//    //2. 버튼 동작시 boardWrite.jsp 값 DB로 전송
//    @Override
//    public String boardWrite(HttpServletRequest jspValue){
//        // 작성일 가져오기
//        String date = jspValue.getParameter("date");
//        //작성자 가져오기
//        String writer = jspValue.getParameter("id");
//        //제목 가져오기
//        String title = jspValue.getParameter("title");
//        //작성 내용 가져오기
//        String contents = jspValue.getParameter("contents");
//
//        // 리스트화 한 후
//
//    }
//
//    //-----------------------------------------------------------------------
//
//    //3. BoardAll.jsp 컨텐츠 셋팅 - DB서 값 받아오기
//    // 3-1. 제목, 작성자, 작성일, 조회수 가져와서 list 화
//    // 3-2. Navi 구현
//    // 3-3. 생성한 값 인터-뷰로 보냄
//
//    //-----------------------------------------------------------------------
//
//    //4. BoardAll.jsp 삭제 구현 - board/delete
//    //4-1. 뷰에서 체크 값 no 받아오기
//
//    //4-2. btn 동작시 입력받은 no들과 일치하는 DB값 삭제하도록 IDAO로 전달
//
//    //4-3. 삭제완료 sysmsg 인터-뷰로 보냄
//
//    //-----------------------------------------------------------------------
//
//    //5. BoardAll.jsp 검색 구현 - board/search
//
//    //5-1. 뷰단에서 입력된 옵션 값 가져오기 :  select option
//
//    //5-2. 뷰단에서 입력된 검색어 값 가져오기 : searchWord
//
//    //5-3. 두 값 map으로 IDAO-DB 로 전송, 일치하는 결과 찾는 SQL 실행
//
//    //5-4. 3에서 실행된 값 IDAO를 통해 가져옴
//
//    //5-5. 4의 결과들을 jsp로 전달
//
//    //-----------------------------------------------------------------------
//
//
//}
