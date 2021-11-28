class A extends Thread
{
    void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.print("A\t");
        }
        System.out.println("\nExit from A");
    }
}
class B extends Thread
{
    void run()
    {
        for(int j=1;j<=100;j++)
        {
            System.out.print("B\t");
        }
        System.out.println("\nExit from B");
    }
}
class C extends Thread
{
    void run()
    {
        for(int k=1;k<=100;k++)
        {
            System.out.print(k+"\t");
        }
        System.out.println("\nExit from C");
    }
}
public class Thread {
    public static void main(String[] args) {
     new A().run();
     new B().run();
     new C().run();
    }

}
