package javaBasic.practice.payment;

public class CashPayment implements PaymentProcess, Refund{
    @Override
    public void pay(double amount) {
        System.out.println("현금으로 " + amount + "원을 결제함");
    }

    @Override
    public boolean needReceipt() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void refund(String number) {
        //바로 환불
    }
}
