class parent{
    void parent1()
    {
        System.out.println("This is a parent");
    }
}
class child extends parent
{
    void child1()
    {
        System.out.println("This is a Child");
    }
}
public class Single {
    public static void main(String[] args) {
        parent p=new parent();
        p.parent1();
        child c=new child();
        c.child1();
        c.parent1();



    }

}
