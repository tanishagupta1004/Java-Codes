import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Employee no");
        int emp_no=s.nextInt();
        System.out.println("Enter Employee name");
        String emp_name=s.next();


        System.out.println("Enter Employee Basic Salary");
        int basic=s.nextInt();

        System.out.println(" Employee no is"+emp_no);
        System.out.println("Enter Employee name"+emp_name);
        System.out.println("Enter Employee Basic Salary"+basic);
        double da=(0.2*basic);
        System.out.println("Employee DA is"+ da);
        double hra=0.05*basic;
        System.out.println("Employee HRA is"+hra);
        /*double pf=0.1*basic;
        System.out.println("Employee PF is"+pf);
        System.out.println("Employee CCA is"+240);
        System.out.println("Employee PT is"+100);*/


    }

}
