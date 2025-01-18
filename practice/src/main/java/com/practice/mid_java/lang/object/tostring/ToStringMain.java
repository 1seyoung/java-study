package com.practice.mid_java.lang.object.tostring;

public class ToStringMain {
    public static void main(String[] args) {
        Object object  = new Object();
        String string = object.toString();

        // to String 반환값 출력
        System.out.println(string); //com.practice.mid_java.lang.object.tostring.ToStringMain@251a69d7

        // Object 직접 출력
        System.out.println(object); //com.practice.mid_java.lang.object.tostring.ToStringMain@251a69d7

        //toString()
        // return getClass().getName() + "@" + Integer.toHexString(hashCode()); //클래스 이름 + @ + 해시코드(객체의 참조값 16진수)

        // println() 메서드는 객체를 출력할 때 toString() 메서드를 호출한다.


    }
}
