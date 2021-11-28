package com.company;
import java.util.Scanner;

public class Assign2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // Factorial
        System.out.println("enter a no whose factorial you want to display");
        int fact=s.nextInt();
        int x=1;
        int i;
        for(i=1;i<=fact;i++)
        {
            x=x*i;
        }
        System.out.println("Factorial of"+ fact +"is" + x);

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
