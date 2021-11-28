import java.util.Scanner;

public class Specific_Exception {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index of array");
        int ar=sc.nextInt();
        System.out.println("Enter the va;ue which you want to divide with");
        int num=sc.nextInt();
        try
        {
            System.out.println("Array index is "+arr[ar]);
            System.out.println("Value of the no divided by an array index is "+arr[ar]/num);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occur");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occur");
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println("Any other Exception occured");
            System.out.println(e);
        }
        System.out.println("End of the Program");
    }

}
