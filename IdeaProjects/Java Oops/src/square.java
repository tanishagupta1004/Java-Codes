class Square1{
    int side=10;
    public void perimeter()
    {
        int perimeter=4*side;
        System.out.println("Perimeter is "+perimeter);

    }
    public void Area()
    {
        int area=side*side;
        System.out.println("Area is"+area);

    }
}
public class square {
    public static void main(String[] args) {
        Square1 s=new Square1();
        s.perimeter();
        s.Area();


    }
}
