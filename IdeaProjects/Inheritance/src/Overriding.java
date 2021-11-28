class base1
{
   void meth1()
   {
       System.out.println("This is a method 1 in base class ");
   }
   void meth2()
   {
       System.out.println("This is a method 2 in base class");
   }
}
class derived1 extends base1
{
    @Override
    void meth2()
    {
        System.out.println("This is a method 2 in derived class");
    }
    void meth3()
    {
        System.out.println("This is a method 3 in derived class");
    }
}
public class Overriding {
    public static void main(String[] args) {
        derived1 d1=new derived1();
        d1.meth2();
        d1.meth2();
    }
}
