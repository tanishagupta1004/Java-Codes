import java.util.Scanner;

public class Nested_Try {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=65;
        marks[1]=98;
        marks[2]=54;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of index");
        int arr=sc.nextInt();
        boolean x=true;
        while(x) {
            try {
                System.out.println("HIII SUNDAY");
                try {
                    System.out.println("Array index is " + marks[arr]);
                    x=false;

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorryyyy Good bye");

                }
            } catch (Exception e) {
                System.out.println("Thank you");
            }
        }


    }
}
