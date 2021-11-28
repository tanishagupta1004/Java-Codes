package com.company;
class Bank {
    int Balance = 0;
    String AccHolderName;
    int AccNumber;
    String AccType;
    Bank(){
        System.out.println("Welcome To The Bank");
    }
    public void setBalance(int x) {
        Balance += x;
    }
    public void setAccHolderName(String x) {
        AccHolderName = x;
    }
    public void setAccNumber(int x) {
        AccNumber = x;
    }
    public void setAccType(String x) {
        AccType = x;
    }
    public void getBalance() {
        System.out.println("Your Balance is " + Balance + "$");
    }
    public void getAccHolderName() {
        System.out.println("Account Holder Name is " + AccHolderName);
    }
    public void getAccNumber() {
        System.out.println("Account Number is " + AccNumber);
    }
    public void getAccType() {
        System.out.println("Account Type is " + AccType);
    }
    public void Deposit(int x){
        Balance += x;
        System.out.println("Balance is " + Balance + "$");
    }
    public void Withdraw(int x){
        Balance -= x;
        System.out.println("Balance is " + Balance + "$");
    }
}

public class Lab_5_Bank {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setAccHolderName("Tanisha");
        b.setBalance(100000000);
        b.setAccType("Saving");
        b.setAccNumber(1);
        b.getAccHolderName();
        b.getBalance();
        b.getAccType();
        b.getAccNumber();
        b.Deposit(10000);
        b.Withdraw(7654);
    }
}
