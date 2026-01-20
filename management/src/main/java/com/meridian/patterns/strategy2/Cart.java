package com.meridian.patterns.strategy2;

public class Cart{
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    public void checkout(int cost){
        paymentStrategy.pay(cost);
    }
}
