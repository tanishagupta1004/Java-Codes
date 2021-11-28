interface Area
{
     void area();
}
interface Perimeter
{
     void perimeter();
}

class Rectangle implements Area, Perimeter
{
    public void area()
        {
            int length=5;
            int breadth=10;
            System.out.println("Area of a Retangle is \n"+length*breadth);

        }
        public void perimeter()
        {
            int length=5;
            int breadth=10;
            System.out.println("Perimeter of a Rectangle is \n"+2*(length+breadth));

        }
}
class Triangle implements Area, Perimeter
{
    public void area()
    {
        int base=5;
        int height=10;
        double area=(0.5*base*height) ;
        System.out.println("Area of a Triangle is \n"+area);

    }
    public void perimeter()
    {
        int side1=5;
        int side2=10;
        int side3=15;
        System.out.println("Perimeter of a Triangle is \n"+side1+side2+side3);

    }
}
class Circle implements Area, Perimeter
{
    public void area()
    {
       int radius=10;
       double area=3.14*radius*radius;
        System.out.println("Area of a Retangle is \n"+area);

    }
    public void perimeter()
    {
        int radius=10;
        double circumference=(2*3.14*10);

        System.out.println("Perimeter of a Rectangle is \n"+circumference);

    }
}

public class Mutiple_Interface {
    public static void main(String[] args) {
        Area a;
        a =new Rectangle();
        a.area();
        Perimeter p;
        p=new Rectangle();
        p.perimeter();
        Area a1;
        a1 =new Triangle();
        a1.area();
        Perimeter p1;
        p1=new Triangle();
        p1.perimeter();
        Area a2;
        a2 =new Circle();
        a2.area();
        Perimeter p2;
        p2=new Circle();
        p2.perimeter();







    }
}
