package com.company;
import java.util.Scanner;
public class assign3_2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the income of an employee");
        long income=s.nextLong();
        long tax= income/100;
        if(income>250000 && income<500000)
        {
            System.out.println("Tax amount is"+ tax*5);
        }
        else if(income>500000 && income<1000000)
        {
            System.out.println("Tax amount is"+ tax*20);
        }
        else if(income>=1000000)
        {
            System.out.println("Tax amount is"+ tax*30);
        }
        else
        {
            System.out.println("No tax to be paid");
        }
    }
}
