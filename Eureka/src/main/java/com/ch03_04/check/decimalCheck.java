package com.ch03_04.check;

import java.math.BigDecimal;

public class decimalCheck {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("0.10"); // BigInteger: 10, Scale: 2
        BigDecimal bd2 = new BigDecimal("0.20"); // BigInteger: 20, Scale: 2

        BigDecimal sum = bd1.add(bd2); // (10 + 20) / 10^2 = 0.30
        System.out.println(sum); // 0.30

        System.out.println("--------------------");
        BigDecimal bd3 = new BigDecimal("3.14");
        BigDecimal bd4 = new BigDecimal("2.00");

        // 내부적으로:
        // bd1: intVal = 314, scale = 2
        // bd2: intVal = 200, scale = 2

        BigDecimal result = bd3.add(bd4);
        // 덧셈 과정:
        // 314 + 200 = 514 (intVal), scale = 2
        // 표현: 514 × 10^(-2) = 5.14
        System.out.println(result); // 5.14

        System.out.println("--------------------");

        // 소수점 다르면?
        BigDecimal num1 = new BigDecimal("0.005"); // scale = 3
        BigDecimal num2 = new BigDecimal("0.1");   // scale = 1

        System.out.println("Before addition:");
        System.out.println("Num1: " + num1 + " (intVal=" + num1.unscaledValue() + ", scale=" + num1.scale() + ")");
        System.out.println("Num2: " + num2 + " (intVal=" + num2.unscaledValue() + ", scale=" + num2.scale() + ")");

        BigDecimal result4 = num1.add(num2);

        System.out.println("\nAfter addition:");
        System.out.println("Result: " + result4 + " (intVal=" + result4.unscaledValue() + ", scale=" + result.scale() + ")");

        //큰 scale 값을 기준으로 스케일을 맞춘다


        System.out.println("--------------------");

        BigDecimal bd7= new BigDecimal("3.14"); // intVal = 314, scale = 2
        BigDecimal bd8 = new BigDecimal("3.140"); // intVal = 3140, scale = 3

        System.out.println(bd7.equals(bd8)); // false (스케일이 다르므로 다른 객체)
        System.out.println(bd7.compareTo(bd8)); // 0 (값은 같음)
    }
}
