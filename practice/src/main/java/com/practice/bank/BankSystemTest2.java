package com.practice.bank;

public class BankSystemTest2 {
    public static void main(String[] args) {
        Bank.ExchangeRateCalculator calculator = new Bank.ExchangeRateCalculator();
        double krwToUsd = calculator.convertKrwToUsd(130000);
        System.out.println("130,000원은 " + krwToUsd + "달러입니다.");

        calculator.convertUsdToKrw(100);
        System.out.println("100달러는 " + calculator.convertUsdToKrw(100) + "원입니다.");
    }
}