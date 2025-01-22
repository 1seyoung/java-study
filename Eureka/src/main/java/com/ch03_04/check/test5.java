package com.ch03_04.check;

public class test5 {
    public static void main(String[] args) {
        // 사다리꼴의 넓이를 구하는 코드이다. 정확히 소수 자리수가 나올 . 있또록 코드를 작성해라
        int lenghthTop = 5;
        int lenghthBottom = 10;
        int height = 7;

        double area = (lenghthTop + lenghthBottom) * height / 2.0;
        double area2 = (lenghthTop + lenghthBottom) * height * 1.0 /2 ;
        double area3 = (double) (lenghthTop + lenghthBottom) * height / 2; //
        double area4 = (double) ((lenghthTop + lenghthBottom) * height / 2);
        System.out.println(area);
        System.out.println(area2);
        System.out.println(area3); //
        System.out.println(area4);
    }
}
