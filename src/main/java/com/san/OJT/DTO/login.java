package com.san.OJT.DTO;

import lombok.Data;

@Data
public class login {

    // 로그인 정보

    // 아이디
    private String id;

    // 패스워드
    private String pw;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }


}
