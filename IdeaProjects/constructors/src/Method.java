import java.lang.Math;
public class Method {
    float area;
    float area1;
    double area2;
    void Area(int radius)
    {
        area=3.14f*radius*radius;
    }
    void display()
    {
        System.out.println("Area of a Circle is "+area);
    }

    void Area(int length,int breadth)
    {
        area1=0.5f*length*breadth;
    }
    void display2()
    {
        System.out.println("Area of a Rectangle is "+area1);
    }
    void Area(int a,int b, int c)
    {
     int s=(a+b+c)/2;
     area2=s*Math.sqrt((s-a)*(s-b)*(s-c));
    }
    void display3()
    {
        System.out.println("Area of a Triangle is "+area2);
    }
    public static void main(String[] args) {
        Method m1=new Method();
        m1.Area(10);
        m1.display();
        m1.Area(2,6);
        m1.display2();
        m1.Area(3,5,6);
        m1.display3();


    }
}
