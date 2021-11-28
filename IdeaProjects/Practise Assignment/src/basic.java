import java.util.Scanner;
public class basic {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        // 1. Factorial
        System.out.println("Enter the no");
        int n=s.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+"is "+fact);


       // 2. Fibonacci Series
        int n1=0,n2=1,n3,i,count;
        System.out.println("Enter the no of terms: ");
        count=s.nextInt();

        System.out.print("Fibonacci Series is "+n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        // 3. Armstrong Number
        System.out.println();
        int sum,digit,temp,num;
        for(i=100;i<=500;i++)
        {
             sum=0;
            temp=i;
            num=i;
            while( temp !=0)
            {
                digit=temp%10;
                sum=sum+(digit*digit*digit);
                temp=temp/10;
            }
            if(sum==num)
            {
                System.out.println(num+" is an Armstrong number");
            }
        }





    }
}
