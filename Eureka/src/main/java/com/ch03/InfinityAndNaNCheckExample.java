package com.ch03;

public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x=5;
        double y = 0.0;
        double z = x/y;
        // double z = x%y;

        //잘못된 코드
        System.out.println(z + 2);

        // 알맞은 코드
        if (Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);
        }

    }
}

/**
 * infinity는 무한대를 의미하며, NaN은 Not a Number를 의미한다.
 * 0으로 나누면 무한대가 되고, 0.0/0.0은 NaN이 된다.
 */