import java.lang.reflect.Array;
import java.util.Arrays;

public class string_sorting {
    public static void main(String[] args) {

        String[] names={"Tanisha","Soham","Jayu","Karan","Mounika","Gayatri","Shreyans","Juhi","Ishika","Sneha"};


        for (String str : names)
        {
            System.out.print(str+"\t");
        }
        System.out.println("\nAfter removing first three elements");
        for(int i = 0; i < 10; i++)
        {
            names[i] = names[i].substring(3);
            System.out.print(names[i]+"\t");
        }
//        System.out.println("Sorted names is :");
//        Arrays.sort(names);
//        for(int i=0;i<10;i++)
//        {
//            System.out.println(names[i]);
//        }
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(names[i].compareTo(names[j])>0)
                {
                    String temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;

                }
            }
        }
        System.out.println("\nSorted names are:");
        for(int i=0;i<10; i++)
        {
            System.out.print( names[i]+"\t");
        }



        }

    }

