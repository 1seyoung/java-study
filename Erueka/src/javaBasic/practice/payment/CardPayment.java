package javaBasic.practice.payment;

public class CardPayment implements PaymentProcess, Refund{

    @Override
    public void pay(double amount) {
        System.out.println( "신용카드로 "+ amount + " 원을 결제함");
    }
    @Override
    public boolean needReceipt() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void refund(String number) {
        // 카드 비밀번호 입력
    }
}
