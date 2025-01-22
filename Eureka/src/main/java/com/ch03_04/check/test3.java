package com.ch03_04.check;

public class test3 {
    public static void main(String[] args) {
        // 534자루의 연필을 30명에게 똑같은 개수로 나누어줄ㄱ때 1인당 몇개를 가질 수 있고 몇 개가 남는지 구하시오.

        int pencils = 534;
        int students = 30;

        //학생 한명이 가지는 연필 수
        int pencilsPerStudent = pencils / students;
        System.out.println("학생 한명이 가지는 연필 수: " + pencilsPerStudent);

        //남은 연필 수
        int pencilsLeft = pencils % students;
        System.out.println("남은 연필 수: " + pencilsLeft);
    }
}
