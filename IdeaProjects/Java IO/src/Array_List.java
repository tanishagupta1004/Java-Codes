import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        List<Integer> x=new ArrayList<Integer>();
        x.add(10);
        x.add(20);
        x.add(30);
        x.add(40);
        System.out.println("Before Reversing");
        System.out.println(x.toString());
        Collections.reverse(x);
        System.out.println("After Reversing");
        System.out.println(x.toString());
    }
}
