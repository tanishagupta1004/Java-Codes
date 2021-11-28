package com.company;
import java.util.Scanner;

public class Cbse_Result {
    public static void main(String[] args) {
        System.out.println("To Display CBSE Results");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the marks of sub 1");
        int a=s.nextInt();
        System.out.println("Enter the marks of sub 2");
        int b=s.nextInt();
        System.out.println("Enter the marks of sub 3");
        int c=s.nextInt();
        System.out.println("Enter the marks of sub 4");
        int d=s.nextInt();
        System.out.println("Enter the marks of sub 5");
        int e=s.nextInt();
        int total=a+b+c+d+e;
        int percentage=(total*100)/500;
        System.out.print("Percentage of a candidate is ");
        System.out.println(percentage);


    }
}
