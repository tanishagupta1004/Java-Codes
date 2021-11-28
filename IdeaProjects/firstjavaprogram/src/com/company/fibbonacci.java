package com.company;
import java.util.Scanner;
public class fibbonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of terms");
        int term=s.nextInt();
        int a=0,b=1,i;
        System.out.println(a);
        System.out.println(b);
        for(i=2;i<term;i++)
        {
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
