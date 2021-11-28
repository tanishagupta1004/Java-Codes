package com.company;
import java.util.Scanner;

public class factorial {
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
    }
}
