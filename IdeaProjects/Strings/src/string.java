import java.util.Locale;

public class string {
    public static void main(String[] args) {
        String name="Tanisha";
        //length()
        System.out.println("Length of the string is:"+name.length());
        System.out.println("Character at index 1 is"+name.charAt(1));
        System.out.println("Substring begins from "+name.substring(3));
        System.out.println("Substring begins from and ends from "+ name.substring(2,5));
        System.out.println("Boolean contains "+name.contains("h"));
        System.out.println("Boolean Equals "+name.equals("Tanisha"));
        System.out.println("Boolean isEmpty "+name.isEmpty());
        System.out.println("String concatenate "+name.concat("gupta"));
        System.out.println("String Replace "+name.replace("T","m"));
        System.out.println("Static String equals ignore case "+name.equalsIgnoreCase("tanisha"));
        System.out.println("Index of n is "+name.indexOf("n"));
        System.out.println("Index of from a search from 3 position "+name.indexOf("a",3));
        System.out.println("IndexOf substring "+name.indexOf("nis"));
        System.out.println("IndexOf substring starting from 2 position "+name.indexOf("ish",2));
        System.out.println("String in Lowercase "+name.toLowerCase());
        System.out.println("String in Uppercase "+name.toUpperCase());
        String str="    tanisha";
        System.out.println("String without using trim() "+str);
        System.out.println("String while using trim() "+str.trim());


    }
}
