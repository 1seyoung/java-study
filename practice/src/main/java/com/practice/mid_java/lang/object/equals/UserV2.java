package com.practice.mid_java.lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        // 최소한의 equals 구현
//        UserV2 user = (UserV2) obj; // obj를 UserV2로 캐스팅
//        return id.equals(user.id);
//    }


    //IDE에서 자동 생성한 equals() 메서드
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id); //
    }

}
