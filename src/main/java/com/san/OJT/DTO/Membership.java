package com.san.OJT.DTO;

import lombok.Data;

@Data
// 회원가입 정보
public class Membership extends login {

    // 아이디
    //private String id;

    // 패스워드
    //private String pw;

    // 직군
    private String job;

//    public String getId() {
//        return id;
//    }

//    public void setId(String id) {
//        this.id = id;
//    }

//    public String getPw() {
//        return pw;
//    }
//
//    public void setPw(String pw) {
//        this.pw = pw;
//    }


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
