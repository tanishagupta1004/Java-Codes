package com.company;
import java.util.Scanner;
public class assign3_4{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the URL");
        String str=s.nextLine();


        if(str.endsWith(".com"))
        {
            System.out.println("Commercial Website");
        }
        else if(str.endsWith(".org"))
        {
            System.out.println("Organization Website");
        }
        else if(str.endsWith(".in"))
        {
            System.out.println("Indian Website");
        }
        else
        {
            System.out.println("Invalid website");
        }
    }





}
