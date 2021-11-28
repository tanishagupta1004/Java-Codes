import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int row= s.nextInt();
        int i,j;
        for(i=0;i<=row;i++)
        {
            for(j=row-i;j>=1;j--)
            {
                System.out.print(" ");

            }


            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }


            for(j=i-1;j>=1;j--)
            {
                System.out.print(j);

            }
            System.out.println();
        }





    }
}
