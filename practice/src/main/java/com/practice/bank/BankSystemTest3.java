package com.practice.bank;

public class BankSystemTest3 {
        public static void main(String[] args) {
            Bank bank = new Bank();

            // 계좌 생성
            Bank.BankAccount account1 = bank.new BankAccount("홍길동", 100000);
            Bank.BankAccount account2 = bank.new BankAccount("김철수", 50000);

            // 입출금 및 잔액 확인
            account1.deposit(50000);
            account1.withdraw(200000); // 잔액 부족
            account1.printBalance();

            account2.deposit(10000);
            account2.withdraw(30000);
            account2.printBalance();

            // 모든 알림 출력
            bank.printAllNotifications();
        }
    }

