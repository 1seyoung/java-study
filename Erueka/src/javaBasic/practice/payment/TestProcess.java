package javaBasic.practice.payment;

import java.util.Scanner;

public class TestProcess {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Select a payment method:");
            System.out.println("1. Credit Card");
            System.out.println("2. Cash");
            System.out.println("3. Mobile Payment");
            System.out.println("4. Exit");
            System.out.print(">>");

            int input = sc.nextInt();
            sc.nextLine();

            if ( input == 4 ) return;

            System.out.print("결제 금액을 입력하세요: ");
            double amount = sc.nextDouble();

            PaymentProcess paymentProcess;

            switch (input) {
                case 1: // 카드결제
                    paymentProcess = new CardPayment();
                    break;
                case 2: // 현금결제
                    paymentProcess = new CashPayment();
                    break;
                case 3: // 모바일결제
                    paymentProcess = new MobilePayment();
                    break;
                default:
                    return;
            }
            paymentProcess.pay(amount);

            // 세영님 현금영수증 발급
            // instanceof 사용 자제 이유 : 객체지향의 5원칙
//	    	if ( paymentProcess instanceof CashPayment ) {
//	    	    System.out.println("현금영수증 발급");
//	    	}

            if ( paymentProcess.needReceipt() ) {
                System.out.println("현금영수증 발급");
            }
        }




    }

}