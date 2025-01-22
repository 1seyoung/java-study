package com.ch05;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        // 배열 선언
        {
            int[] intArray; // 일반적
            int intArray2[];
        }

        // 배열 생성
        {
            int[] intArray = new int[5]; // 길이가 5인 int 배열 객체가 생성됨
            int[] intArray2 = {1, 2, 3, 4, 5}; // 길이가 5인 int 배열
            int a = 10; int b = 20;
            int[] intArray3 = {a, b, 3, 4, 5};
            int[] intArray4 = new int[]{1, 2, 3, a, b};

            System.out.println(intArray);
            System.out.println(intArray2);
            System.out.println(intArray3);
            System.out.println(intArray4);

            // 배열의 항목을 출력하려면 Arrays.toString()
            System.out.println(Arrays.toString(intArray));
            System.out.println(Arrays.toString(intArray2));
            System.out.println(Arrays.toString(intArray3));
            System.out.println(Arrays.toString(intArray4));
        }

        // String []
        {
            String[] strArray = {"Hello", "World", "Java"};
            System.out.println(Arrays.toString(strArray));
        }
    }
}