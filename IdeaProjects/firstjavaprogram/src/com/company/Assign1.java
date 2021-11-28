package com.company;
import java.util.Scanner;


public class Assign1 {
    public static void main(String[] args) {
        //System.out.println("hello world");

        /*int a=10;
        char c='T';
        float f=76.98f;
        int type=(int)f;
        System.out.println(a);
        System.out.println(c);
        System.out.println(f);
        System.out.println(type);*/
        /*int a=5, b=20, c=2;
        double determinant=Math.sqrt(b*b-4*a*c);
        double R1=(-b+ determinant)/(2*a);
        double R2=(-b- determinant)/(2*a);
        System.out.println(R1);
        System.out.println(R2);*/

        /*Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Addition is"+ (num1+num2));
        System.out.println("Subtraction is"+ (num1-num2));
        System.out.println("Multiplication is"+ num1*num2);
        System.out.println("Division is"+ num1/num2);*/

        float salary, basic_salary,hra,da;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary");
        basic_salary=sc.nextFloat();
        hra=basic_salary*0.2f;

        da=basic_salary*0.5f;

        salary=basic_salary+hra+da;
        System.out.println("Salary of a person is");
        System.out.println(salary);




    }
}
