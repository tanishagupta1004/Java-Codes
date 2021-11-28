public class Overloading {
    int roll_no;
    String name;
    int age;
    Overloading(int id,String n)
    {
        roll_no =id;
        name=n;

    }
    Overloading(int id,String n,int a)
    {
        roll_no=id;
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println("Roll_no is "+roll_no+" Name is "+name+" Age is "+age);
    }
    public static void main(String[] args) {
        Overloading o1=new Overloading(1,"tan");
        o1.display();
        Overloading o2=new Overloading(2,"mon",87);
        o2.display();
        Overloading o3=new Overloading(3,"jan",76);
        o3.display();



    }
}
