package com;
import java.util.Scanner;
public class Lab_3_Table {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Multiplication Table");
        int mul=s.nextInt();

        int i;
        for(i=1;i<=10;i++)
        {
           System.out.printf("%d*%d=%d",mul,i,mul*i);
            System.out.println();
        }

    }
}
