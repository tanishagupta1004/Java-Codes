package com.company;

public class pattern2 {
    public static void main(String[] args) {
        int i,j;
        char ch='A';
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
