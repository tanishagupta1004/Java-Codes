package com.company;
import java.util.Scanner;
public class assign3_3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the day no");
        int ch=s.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuseday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }
}
