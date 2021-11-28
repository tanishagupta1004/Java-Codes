package com.company;
import java.util.Scanner;
public class assign3_1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the total marks of each sub");
        int tot=s.nextInt();
        System.out.println("enter the marks of sub 1");
        int sub1=s.nextInt();
        System.out.println("enter the marks of sub 2");
        int sub2=s.nextInt();
        System.out.println("enter the marks of sub 3");
        int sub3=s.nextInt();
        int avg=(sub1+sub2+sub3)/3;
        int percentage=avg*100;
        int p1=(sub1*100)/tot;
        int p2=(sub2*100)/tot;
        int p3=(sub3*100)/tot;
        if(percentage>=40 && p1>=33 && p2>=33 && p3>=33)
        {
            System.out.println("Student is pass");
        }
        else
        {
            System.out.println("Student is fail");
        }


    }
}
