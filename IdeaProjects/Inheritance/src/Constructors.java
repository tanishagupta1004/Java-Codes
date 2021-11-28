class base
{
    base()
    {
        System.out.println("This is a base class");
    }
    base(int x)
    {
        System.out.println("This is a base class with value "+x);
    }
}
class intermediate extends base
{
    intermediate()
    {
        System.out.println("This is an intermediate class");
    }
    intermediate(int x,int y)
    {
        super(x);
        System.out.println("This is an intermediate class with value "+y);
    }
}
class derived extends intermediate
{
    derived()
    {
        System.out.println("This is a derived class");
    }
    derived(int x,int y,int z)
    {
        super(x, y);
        System.out.println("This is a derived class constructor with value "+z);
    }
}
public class Constructors {
    public static void main(String[] args) {
     derived d=new derived(5,7,9);
    }
}
