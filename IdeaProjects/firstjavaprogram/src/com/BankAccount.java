package com;
import java.util.*;
import java.lang.*;
import java.io.*;


public class BankAccount
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scan.nextLine();
        System.out.println("Enter the Account Number: ");
        int ac = scan.nextInt();
        System.out.println("Enter the Account Type: (Savings) or (Current) ");
        String acType = scan.nextLine();
        System.out.println("Enter the Balance: ");
        double bal = scan.nextDouble();
        System.out.println("------------------------");
    }
}