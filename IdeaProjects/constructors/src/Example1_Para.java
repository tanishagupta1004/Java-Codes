public class Example1_Para {
    int id;
    String name;
    Example1_Para(int i,String n)
    {
        id=i;
        name=n;

    }
    void display()
    {
        System.out.println("Student id n name is "+id+name);
    }
    public static void main(String[] args) {
     Example1_Para p=new Example1_Para(2,"Tanisha");
     p.display();
     Example1_Para p1=new Example1_Para(3,"Juhi");
     p1.display();
     Example1_Para p2=new Example1_Para(4,"Ishika");
     p2.display();

    }
}
