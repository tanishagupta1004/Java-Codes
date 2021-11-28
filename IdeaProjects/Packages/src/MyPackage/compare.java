package MyPackage;
public class compare {
   public compare(int a,int b)
    {

      getMax( a,b);
    }
    void getMax(int a,int b)
    {
        if( a>b)
        {
            System.out.println(a+" is greater the "+b);
        }
        else
        {
            System.out.println(b+ " is greater tha "+a);
        }
    }
    public static void main(String[] args) {

    }
}
