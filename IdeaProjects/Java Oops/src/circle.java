class circle1
{
    float radius=10;
    public void perimeter()
    {
       double perimeter= 2*3.14*radius;
       System.out.println("Perimeter of Circle is "+perimeter);
    }
    public void area()
    {
       double area=3.14*radius*radius;
        System.out.println("Area of a Circle is"+area);
    }
}
public class circle {
    public static void main(String[] args) {
        circle1 c=new circle1();
        c.perimeter();
        c.area();
    }
}
