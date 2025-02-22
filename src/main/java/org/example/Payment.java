package org.example;

abstract  class  Payment{
    public  abstract void processPayment();
}

class  CreditCardPayment extends Payment{

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment ...");
    }
}

class UPIPayment extends Payment{

    @Override
    public void processPayment() {
        System.out.println("Processing UPI Payment...");
    }
}

class  PayPalPayment extends Payment{

    @Override
    public void processPayment() {
        System.out.println("Processing PayPalPayment Payment...");
    }
}

