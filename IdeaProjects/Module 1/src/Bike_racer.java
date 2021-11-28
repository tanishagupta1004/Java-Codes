import java.util.Scanner;
public class Bike_racer {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the speed of Racer 1");
        int r1=s.nextInt();
        System.out.println("Enter the speed of Racer 2");
        int r2=s.nextInt();
        System.out.println("Enter the speed of Racer 3");
        int r3=s.nextInt();
        System.out.println("Enter the speed of Racer 4");
        int r4=s.nextInt();
        System.out.println("Enter the speed of Racer 5");
        int r5=s.nextInt();
        double avg=((r1+r2+r3+r4+r5)/5);
        if(r1>avg)
        {
            System.out.println("Racer 1 Qualify");
        }
        else if(r2>avg)
        {
            System.out.println("Racer 2 Qualify");
        }
        else if(r3>avg)
        {
            System.out.println("Racer 3 Qualify");
        }
        else if(r4>avg)
        {
            System.out.println("Racer 4 Qualify");
        }
        else if(r5>avg)
        {
            System.out.println("Racer 5 Qualify");
        }
        }
}
