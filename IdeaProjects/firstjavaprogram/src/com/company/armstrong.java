package com.company;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, sum = 0, digit,n,temp;
        System.out.println("enter the power");
            int power=s.nextInt();
        System.out.println("enter the no");
         n=s.nextInt();
         temp=n;

            switch(power)
            {
                case 3:
                    while (n != 0) {
                        digit = n % 10;
                        sum = sum + (digit * digit * digit);
                        n = n / 10;
                    }
                    if (sum == temp) {
                        System.out.println(temp + " is an armstrong no");
                    }
                    else
                    {
                        System.out.println(temp +"is not an armstrong no");
                    }
                    break;
                case 4:
                    while (n != 0) {
                        digit = n % 10;
                        sum = sum + (digit * digit * digit*digit);
                        n = n / 10;
                    }
                    if (sum == temp) {
                        System.out.println(temp + " is an armstrong no");
                    }
                    else
                    {
                        System.out.println(temp +"is not an armstrong no");
                    }



            }



        }

}
