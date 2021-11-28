class phone
{
   void meth1()
   {
       System.out.println("This is method 1 in class phone");
   }
   void meth2()
   {
       System.out.println("This is method 2 in class phone");
   }

}
class smartphone extends phone
{
    void meth2()
    {
        System.out.println("This is method 2 in class Smartphone");
    }
    void meth3()
    {
        System.out.println("This is method 3 in class Smartphone");
    }
}
public class dynamic_dispatch {
    public static void main(String[] args) {
        phone p=new smartphone();
        //smartphone s=new phone();  Not Allowed
        p.meth1();
        p.meth2(); // Overridden method will run i.e method of class Smartphone
       // p.meth3(); Not allowed
    }
}
