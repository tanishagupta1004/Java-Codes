package com.company;
import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Random rand=new Random();
        int ub=3;
        int ch1=rand.nextInt(ub);
        //System.out.println("Computer choice is "+ch1);
        Scanner s=new Scanner(System.in);
        System.out.println("Press\n 1. Rock\n 2. Paper\n 3. Scissor");
        int ch=s.nextInt();

        if(ch1==1 && ch==1)
        {
            System.out.println("Tie");
        }
        else if(ch1==1 && ch==2)
        {
            System.out.println("Player Wins");
        }
        else if(ch1==1 && ch==3)
        {
            System.out.println("Computer Wins");
        }
        else if(ch1==2 && ch==1)
        {
            System.out.println("Computer Wins");
        }
        else if(ch1==2 && ch==2)
        {
            System.out.println("Tie");
        }
        else if(ch1==2 && ch==3)
        {
            System.out.println("Player Wins");
        }
        else if(ch1==3 && ch==1)
        {
            System.out.println("Player Wins");
        }
        else if(ch1==3 && ch==2)
        {
            System.out.println("Computer Wins");
        }
        else if(ch1==3 && ch==3)
        {
            System.out.println("Tie");
        }

    }
}
