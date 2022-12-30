package com.driver;

public class Main {
    public static void main(String[] args) throws Exception {
        BankAccount b=new BankAccount("krisha",400,200);
        System.out.println(b.generateAccountNumber(9,9));
    }
}