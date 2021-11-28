import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=s.nextInt();
        System.out.println("Enter value of b");
        int b=s.nextInt();
        System.out.println("Enter value of c");
        int c=s.nextInt();

        double discriminant=Math.sqrt(b*b-4*a*c);
        if(discriminant>0)
        {
            System.out.println("No is real"+discriminant);
        }
        else
        {
            System.out.println("No is not real"+discriminant);
        }


    }
}
