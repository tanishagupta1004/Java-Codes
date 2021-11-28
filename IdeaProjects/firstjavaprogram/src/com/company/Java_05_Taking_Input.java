package com.company;
import java.util.Scanner;

public class Java_05_Taking_Input {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner s=new Scanner(System.in);
        /*System.out.println("Enter first number");
        int a=s.nextInt();
        System.out.println("Enter second number");
        int b=s.nextInt();
        int sum=a+b;
        int diff=a-b;
        int mul=a*b;
        int div=a/b;
        System.out.print("Sum of two no is");
        System.out.println(sum);
        System.out.print("Difference of two no is");
        System.out.println(diff);
        System.out.print("Multiplication of two no is");
        System.out.println(mul);
        System.out.print("Divison of two no is");
        System.out.println(div);
        boolean b1=s.hasNextInt();
        System.out.println(b1);
        String str=s.next(); // will take only one word eventhough we'll type the whole sentence.
        System.out.println(str);*/
        String str1=s.nextLine();
        System.out.println(str1);


    }
}
