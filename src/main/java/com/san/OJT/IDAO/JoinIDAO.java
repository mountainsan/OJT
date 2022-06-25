package com.san.OJT.IDAO;

import com.san.OJT.DTO.Membership;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JoinIDAO {

    public void joinProc(Membership membership);

    // ID중복확인 : DB서 값 받아오기
    public int DBCheck(String userID);

    // 로그인용 일치값 가져오기
    int DBckID(String inputID);
    int DBckPW(String inputPW);

    //로그인 성공 int
    int loginConfirm(String inputID,String inputPW);

}
