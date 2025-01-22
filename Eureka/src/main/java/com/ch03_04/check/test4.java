package com.ch03_04.check;

public class test4 {
    public static void main(String[] args) {
        //십의 자리 이하를 버리는 코드이다. 변수 value의 값이 356이라면 300이 나올수 있도록 코드를 작성해라
        // 산술연산자만 사용할 것
        int value = 356;
        System.out.println(value - value % 100);

    }
}
