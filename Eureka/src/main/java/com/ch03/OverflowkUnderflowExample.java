package com.ch03;

public class OverflowkUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for(int i =0; i<5; i++) {
            var1++;
            System.out.println("var1: " + var1);
        }

        System.out.println("-------------------");

        byte var2 = -125;
        for(int i = 0; i<5; i++) {
            var2--;
            System.out.println("var2: " + var2);
        }
    }
}
/**
 * var1: 126
 * var1: 127
 * var1: -128
 * var1: -127
 * var1: -126
 * -------------------
 * var2: -126
 * var2: -127
 * var2: -128
 * var2: 127
 * var2: 126
 *
 * byte 타입의 변수는 -128 ~ 127까지의 값을 표현할 수 있다.
 * 따라서 var1의 값이 127에서 1을 더하면 -128이 되고, -128에서 1을 더하면 -127이 된다.
 */