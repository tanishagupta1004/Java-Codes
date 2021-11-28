class Fibbonnaci extends Thread {
    public void run() {
        int n1 = 0, n2 = 1, n3, i;
        System.out.print(" " + n1 + " ");
        System.out.print(" " + n2 + " ");

        for (i = 2; i < 20; i++) {

            n3 = n1 + n2;
            System.out.print(" " + n3 + " ");
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}
class mul extends Thread{
    public void run()
    {
        int i; for(i=1;i<=50;i++)
    {
        System.out.println(" 5 * "+i+" = "+(i*5)+" ");
    }

    }
}
public class Thread_1 {
    public static void main(String[] args) {
     Fibbonnaci f=new Fibbonnaci();
     mul m =new mul();
     f.run();
     m.run();
    }
}

