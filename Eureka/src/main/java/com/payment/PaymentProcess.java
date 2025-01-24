package com.payment;

public interface PaymentProcess {
    void pay(double amount);

    boolean needReceipt();
}

//카드, 현금 , 간편 결제