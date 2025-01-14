package com.practice.web_practice.domain;

public class Member {
    // 데이터 : 회원 아이디, 이름
    private Long id;
    private String name;

    // getter, setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
