package com.company;
import java.util.Scanner;

public class CH_02_Problem {
    public static void main(String[] args) {
        // To find the Result of the following expression
        float a=7/4.0f*9/2.0f;
        // here 7/4.0 will debug first then 9/2.0 cuz associvity goes from L ---> R
        System.out.println(a);
        // Grade
        char grade='K';
        grade=(char)(grade+8);
        System.out.println(grade);
        grade=(char)(grade-8);
        System.out.println(grade);
        //Comparison operator
        Scanner scan= new Scanner(System.in);
        int b= scan.nextInt();
        int num2=7;
        if(num2>b)
        {
            System.out.println(num2 +"is greater than" +b);
        }
        else
        {
            System.out.println(b +"is greater than" +num2);
        }
        // Expression in Java
        int v=10, u=5, x=3,y=5;
        double exp=((v*v)-(u*u))/(2*x*y);
        System.out.println(exp);
        // Increment Decrement Operator
        int m=7;
        int n=7*49/7 +35/7;
        System.out.println(n);





    }
}
