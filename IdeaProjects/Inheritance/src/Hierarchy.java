class Shape
{
    float length=4;
}

class twoD extends Shape
{
    float breadth=2;
    float radius=10;
}
class Rectangle extends twoD
{
    void area()
    {
        System.out.println("Area of a Rectangle is "+length*breadth);
    }
    void perimeter()
    {
        System.out.println("Perimeter of a Rectangle "+2*(length+breadth));
    }
}
class Square extends twoD
{
    void area()
    {
        System.out.println("Area of a Square is "+length*length);
    }
    void perimeter()
    {
        System.out.println("Perimeter of a Square "+2*(length));
    }
}
class Circle extends twoD
{
    void area()
    {
        System.out.println("Area of a Circle is "+3.14f*radius*radius);
    }
    void perimeter()
    {
        System.out.println("Circumference of a Circle "+2*3.14f*radius);
    }
}
public class Hierarchy {
    public static void main(String[] args) {

     Circle c=new Circle();
     c.area();
     c.perimeter();
     Rectangle r=new Rectangle();
     r.area();
     r.perimeter();
     Square s=new Square();
     s.area();
     s.perimeter();
    }
}
