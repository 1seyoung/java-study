package com.practice.bank;

public class BankSystemTest {
    public static void main(String[] args) {
        //Bank bank = new Bank();

        // Inner Class 사용: 계좌 생성 및 관리
        Bank.BankAccount account = new Bank().new BankAccount("홍길동", 100000); // 초기 잔액 100,000원
        //Bank.BankAccount account = bank.new BankAccount("홍길동", 100000); // 초기 잔액 100,000원
        account.deposit(50000);  // 50,000원 입금
        account.withdraw(20000); // 20,000원 출금

        System.out.println("현재 잔액 (KRW): " + account.getBalance() + "원");

        // Nested Class 사용: 달러 잔액 확인
        account.printBalanceInUsd(); // 환율 계산을 통해 달러 잔액 출력

        // 추가적으로 Nested Class를 직접 사용해도 동작
        Bank.ExchangeRateCalculator calculator = new Bank.ExchangeRateCalculator();
        double krwToUsd = calculator.convertKrwToUsd(130000);
        System.out.println("130,000원은 " + krwToUsd + "달러입니다.");


    }
}