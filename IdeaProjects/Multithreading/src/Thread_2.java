class Fibonacci extends Thread
{
    void run() {
        try {
            int a = 0, b = 1;
            System.out.print(a + "\t" + b);
            for (int i = 3; i <= 50; i++) {
                int c = a + b;
                System.out.print("\t" + c);
                a = b;
                b = c;


            }

            System.out.println();
            //Thread.sl
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }


}
class multiplication extends Thread
{
    void run()
    {
        int a=5;
        for(int i=1;i<=50;i++)
        {
            int x=a*i;
            System.out.print(x+"\t");
        }
        System.out.println();
    }
}
class alphabet extends Thread
{
    void run()
    {
      char c;
      for(c='a';c<='z';c++)
      {
          System.out.print(c+"\t");
      }
        System.out.println();
    }
}
class character extends Thread
{
    void run()
    {
    for(int k=1;k<=100;k++)
    {
        System.out.print("*\t");
    }
        System.out.println();
    }
}
public class Thread_2 {
    public static void main(String[] args) {
     new Fibonacci().run();
     new multiplication().run();
     new alphabet().run();
     new character().run();

    }
}
