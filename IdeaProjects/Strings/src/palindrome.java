import java.util.Locale;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=s.nextLine();
        str=str.toLowerCase(Locale.ROOT);
        String rev="";
       for(int i=str.length()-1;i>=0;i--)
       {
           rev=rev+str.charAt(i);
       }
        System.out.println(rev);
       if(str.equals(rev))
       {
           System.out.println("String is a Palindrome "+rev);
       }
       else
       {
           System.out.println("String is not a Palindrome "+rev);
       }
    }
}
