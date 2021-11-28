import java.util.Locale;
import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String");
        int count = 0;

        String name = s.nextLine();
        for (int i = 0; i < name.length(); i++) {
            //Checks whether a character is a vowel
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
                    || name.charAt(i) == 'u' || name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I'
                    || name.charAt(i) == 'O' || name.charAt(i) == 'U')
            {
                //Increments the vowel counter
                count++;
            }
        }
        System.out.println("Total no of vowels in a String is "+count);
    }
}
