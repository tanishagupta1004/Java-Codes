abstract class shape{

    float length=10,breadth=2;
    int radius=10;
     void hello()
     {
         System.out.println("Hello");
     }
    abstract public void area();
    abstract public void perimeter();

}
class Rectangle extends shape{
    public void area()
    {
        System.out.println("Area of a Rectangle is "+length*breadth);
    }
    public void perimeter()
    {
        System.out.println("Perimeter of a Rectangle is "+2*(length+breadth));
    }

}
class Square extends shape{
    public void area()
    {
        System.out.println("Area of a Square is "+length*length);
    }
    public void perimeter()
    {
        System.out.println("Perimeter of a Square is "+4*length);
    }

}
class Circle extends shape{
    public void area()
    {
        System.out.println("Area of a Circle is "+3.14*radius*radius);
    }
    public void perimeter()
    {
        System.out.println("Perimeter of a Circle is "+2*3.14*radius);
    }

}



public class Example1 {
    public static void main(String[] args) {
    Rectangle r=new Rectangle();
    r.area();
    r.perimeter();
    Square s=new Square();
    s.area();
    s.perimeter();
    Circle c=new Circle();
    c.area();
    c.perimeter();
    }
}
