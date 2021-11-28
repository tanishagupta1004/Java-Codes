package com.company;

public class pattern1 {
    public static void main(String[] args) {
        int i,j,k=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
               if(j>=i+1 && j<=j-1)
               {
                   System.out.println(k);
                   k++;
               }
               else
               {
                   System.out.print(" ");
                   k--;
               }
            }
            System.out.println();
        }
    }
}
