import java.util.*;

public class Assignment {
    public static void main(String[] args) {
        Vector name=new Vector<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of names");
        int count=sc.nextInt();
        for(int i=1;i<=count;i++)
        {
            System.out.println("Enter :"+i+"Name:");
            name.add(sc.next());
        }
        Iterator iterator = name.iterator();

        //6
        System.out.println("You have entered : ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        int ch;
        do {
            System.out.println("Select Any 1 of the below Operation\n 1. Delete a Member in a List \n 2. Add a Member at a Specified Location " +
                    "in a list \n 3. Add a Member at the end of the List \n 4. Print the content of the List \n");
            ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter the Element to be Deleted");
                    String del=sc.next();
                    boolean b=name.remove(del);
                    System.out.println("Deletion Sucessfull ? "+b);
                    break;
                case 2:
                    System.out.println("Enter the index post");
                    int pos= sc.nextInt();
                    System.out.println("Enter the name");
                    String str=sc.next();
                    name.add(pos,str);

                    break;
                case 3:
                    Vector addition=new Vector<>();
                    System.out.println("Enter the name you want to add");
                    addition.add(sc.next());


                    boolean x=name.addAll(addition);
                    System.out.println("Is updation sucessfull "+x);
                case 4:
                    System.out.println("Content in the Vector is " + name);



            }

        }while(ch!=5);



    }
}
