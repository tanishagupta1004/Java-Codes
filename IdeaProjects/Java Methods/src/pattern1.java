public class pattern1 {
    public static void pattern()
    {
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=7;j++)
            {
                if(j>=5-i && j<=5+i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        pattern1 p=new pattern1();
        p.pattern();
    }
}
