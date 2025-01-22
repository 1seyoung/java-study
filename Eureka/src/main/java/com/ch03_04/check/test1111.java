package com.ch03_04.check;

import java.util.Scanner;

public class test1111 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int balance = 0;

            while (true) {
                System.out.println("---------------------------------");
                System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
                System.out.println("---------------------------------");
                System.out.print("선택> ");
                String str = sc.next();


                if (str.equals("1")) {
                    System.out.print("예금액>");
                    int deposit = sc.nextInt();
                    balance += deposit;
                } else if (str.equals("2")) {
                    System.out.print("출금액>");
                    int withdraw = sc.nextInt();
                    balance -= withdraw;
                } else if (str.equals("3")) {
                    System.out.print("잔고>");
                    System.out.println(balance);
                } else if (str.equals("4")) {
                    System.out.println("\n프로그램 종료");
                    break;
                }
                System.out.println();
            }
        }
    }

