package com;
import java.util.Scanner;
public class Lab_3_Reverse {
    void reverse(int n) {
        int digit, sum = 0;
        while (n != 0) {

            digit = n % 10;
            sum = sum * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reverse is " + sum);
    }

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no");
        int n = s.nextInt();
        Lab_3_Reverse num = new Lab_3_Reverse();
        num.reverse(n);
    }
}
