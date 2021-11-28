package com.company;
import java.util.Scanner;
public class sum0fdigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //Sum of digit
        System.out.println("enter the no whose sum you want to calculate");
        int num=s.nextInt();
        int sum=0, digit=0;
        while(num!=0)
        {
            digit=num%10;
            sum=sum+digit;
            num=num/10;

        }
        System.out.println("sum of digit of is"+sum);
    }

}
