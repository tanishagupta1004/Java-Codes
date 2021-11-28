class rectangle1{
    int length,breadth;
    public void perimeter()
    {
        int perimeter= 2*(length+breadth);
        System.out.println(perimeter);
    }
    public void area()
    {
      int area=length*breadth;
        System.out.println(area);
    }

}
public class Rectangle {
    public static void main(String[] args) {
     rectangle1 r=new rectangle1();
     r.length=4;
     r.breadth=4;
     r.perimeter();
     r.area();

    }
}
