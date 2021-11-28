package com.company;
import java.util.Scanner;

public class Java_Practise_Problem {
    public static void main(String[] args) {
        // Problem 1
        System.out.println("To calculate Sum of 3 numbers");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 3 integer values");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int sum=a+b+c;
        System.out.println("Sum of three numbers is " + sum);

        // Problem 2
        System.out.println("To calculate cgpa");
        int sub1=56;
        int sub2=89;
        int sub3=76;
        int sums=sub1+sub2+sub3;
        int cgpa=sums/30;
        System.out.println("Cgpa of a student is" + cgpa);


        // Problem 3
        System.out.println("To Display the name of the user");
        System.out.println("Enter your name ");
        String str= s.next();
        System.out.println("Hello " + str + " have a good day");
        // Problem 4
        System.out.println("To convert kilometer to mile");
        System.out.println("Enter the no the kilometers");
        float km=s.nextFloat();
        float miles= km/1.6f;
        System.out.println("No of miles is" + miles);

        // Problem 5
        System.out.println("To detect whether the no entered is an integer or not");
        System.out.println("enter your number");
        System.out.println(s.hasNextInt());




    }
}
