package com;
import java.util.Scanner;
public class Lab_4_Largestno {
    public static void main(String[] args) {
        int n, max;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = input.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum value:"+max);
    }
}
