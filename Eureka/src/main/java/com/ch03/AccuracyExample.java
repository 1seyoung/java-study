package com.ch03;

public class AccuracyExample {
    // 산술 연산을 정확하게 계산하고 싶다면 실수 타입을 사용하지 않는 것이 좋다.
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result= apple- number * pieceUnit;
        System.out.println("사과 한개에서" + number + "조각을 빼면,"  + result + "조각이 남는다.");
    }
}
