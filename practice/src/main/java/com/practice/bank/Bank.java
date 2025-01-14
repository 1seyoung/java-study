package com.practice.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private static double usdToKrwRate = 1300.0; // 환율 (정적 데이터)
    private List<Notification<?>> notifications = new ArrayList<>(); // 제네릭 알림 리스트


    // Static Nested Class

    static class ExchangeRateCalculator  {

        public double convertUsdToKrw (double usd) {
            return usd * usdToKrwRate;
        }

        public double convertKrwToUsd (double krw) {
            return krw / usdToKrwRate;
        }
    }

    // Inner Class: 계좌
    class BankAccount {
        private String accountHolder; // 계좌 소유자
        private double balance;       // 계좌 잔액 (원화 기준)

        public BankAccount(String accountHolder, double initialBalance) {
            this.accountHolder = accountHolder;
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                addNotification(new Notification<>("입금", accountHolder + "님이 " + amount + "원을 입금하였습니다."));
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                addNotification(new Notification<>("출금", accountHolder + "님이 " + amount + "원을 출금하였습니다."));
            } else {
                addNotification(new Notification<>("출금 실패", accountHolder + "님의 잔액이 부족합니다."));
            }
        }

        public double getBalance() {
            return balance;
        }

        public void printBalance() {
            addNotification(new Notification<>("잔액 조회", accountHolder + "님의 잔액: " + balance + "원"));
            System.out.println(accountHolder + "님의 잔액: " + balance + "원");
        }

        // 달러 잔액 확인 (Nested Class 사용)
        public void printBalanceInUsd() {
            ExchangeRateCalculator calculator = new ExchangeRateCalculator();
            double balanceInUsd = calculator.convertKrwToUsd(balance);
            System.out.println(accountHolder + "님의 계좌 잔액 (USD): " + balanceInUsd + "달러");
        }
    }


    // 알림 추가
    public void addNotification(Notification<?> notification) {
        notifications.add(notification);
    }

    // 모든 알림 출력
    public void printAllNotifications() {
        System.out.println("=== 모든 알림 ===");
        for (Notification<?> notification : notifications) {
            System.out.println(notification);
        }
    }
}

