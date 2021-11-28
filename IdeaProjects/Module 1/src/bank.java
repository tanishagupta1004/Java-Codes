import java.util.Scanner;
public class bank {

    public static void createAccount()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Customer name");
        String name=s.nextLine();
        System.out.println("Enter Customer Account No");
        int acc_no=s.nextInt();
        System.out.println("Enter Initial Balance");
        int initial=s.nextInt();

    }
    public static void deposit()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the amount you want to deposite");
        int dep=s.nextInt();
    }
    public static void withdraw()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw");
        int with=s.nextInt();

    }
    public static void computeInterest()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter interest");
        int interest=s.nextInt();
        //int tot_int=interest*initial;

    }
    public static void displayBalance()
    {

    }
    public static void main(String[] args) {

    }
}
