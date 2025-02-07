package javaBasic.practice.payment;

public class MobilePayment implements PaymentProcess, Refund{
    @Override
    public void pay(double amount) {
        System.out.println("모바일 간편결제로" + amount +"원 결제함");
    }

    @Override
    public boolean needReceipt() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void refund(String number) {
        // 휴대폰 번호 입력

    }
}
