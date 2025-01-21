package com.ch03;

public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 20;
        int v3 = 5;
        long v4 = 10;

        int result1 = v1 + v2;
        System.out.println("result : "+result1); // 모든 피연산자는 Int 타입으로 자동 변환 후 연산

        long result2 = v1 + v2 -v4; //모든 피연산자는 long 타입으로 자동 변환 후 연산
        System.out.println("result : "+result2);

        double result3 = (double) v1 / v2;
        System.out.println("result : "+result3); // double 타입으로 강제 변환 후 연산

        int result4 = v1  % v2;
        System.out.println("result : "+result4);
    }
}
