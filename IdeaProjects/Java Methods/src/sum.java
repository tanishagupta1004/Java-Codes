public class sum {
    int sum(int a, int b, int c)
    {
        System.out.println("Addition of three no is");
        return a+b+c;
    }
    int sum(int a, int b)
    {
        System.out.println("Addition of two no is");
        return a+b;
    }
    int sum(int a)
    {
        System.out.println("Addition of 1 no is");
        return a;
    }

    public static void main(String[] args) {
        sum s=new sum();
        s.sum(12,34,1);
        s.sum(23,1);
        s.sum(2);
    }
}
