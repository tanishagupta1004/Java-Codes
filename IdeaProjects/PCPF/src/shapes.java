public class shapes {

    void Area()
    {
        System.out.println(" Area in default constructor");
    }
    void Area(int l,int b)
    {
        int area;
        area = l*b;
        System.out.println("The area of Rectangle is : "+area+" m^2");
    }
    void Area(double r)
    {
        double area;
        area = 3.14*r*r;
        System.out.println("The area of Circle is : "+area+" m^2");
    }
    void Area(int a)
    {
        int area;
        area = a*a;
        System.out.println("The area of Square is : "+area+" m^2");
    }

    void Perimeter()
    {
        System.out.println("Perimeter in default constructor");
    }
    void Perimeter(int l,int b)
    {
        int p = 2*(l+b);
        System.out.println("The perimeter of Rectangle is : "+p+" m");
    }
    void Perimeter(double r)
    {
        double p = 2*3.14*r;
        System.out.println("The perimeter of Circle is : "+p+" m");
    }
    void Perimeter(int a)
    {
        int p = 4*a;
        System.out.println("The perimeter of Square is : "+p+" m");
    }

    shapes()
    {
        Area();
        Perimeter();
    }
    shapes(int l, int b)
    {
        Area(l,b);
        Perimeter(l,b);
    }
    shapes(double r)
    {
        Area(r);
        Perimeter(r);
    }
    shapes( int a)
    {
        Area(a);
        Perimeter(a);
    }

    public void finalize()
    {
        System.out.println("Object is destroyed by the Garbage Collector");
    }

    public static void main(String args[])
    {
        shapes s1 = new shapes();
        s1.finalize();
        System.gc();
        System.out.println();

        shapes s2 = new shapes(5,4);
        s2.finalize();
        System.gc();
        System.out.println();

        shapes s3 = new shapes(5.5);
        s3.finalize();
        System.gc();
        System.out.println();

        shapes s4 = new shapes(6);
        s4.finalize();
        System.gc();
    }
}
