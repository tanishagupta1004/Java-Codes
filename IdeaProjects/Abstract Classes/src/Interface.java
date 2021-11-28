interface Vehicle{
    void colors(String color);
    void ApplyBreak(int decrement);
    void SpeedUp(int increment);

}
class Bicycle implements Vehicle{
   public void colors(String color)
    {
        System.out.println("Color of Bicycle is "+color);
    }
    int speed=8;
    public void ApplyBreak(int decrement)
    {
        speed=speed-decrement;
        System.out.println("Speed of Bicycle After Applying breaks "+speed);

    }
    public void SpeedUp(int increment)
    {
        speed=speed+increment;
        System.out.println("Speed of Bicycle After Speeding Up "+speed);
    }

}
class Car implements Vehicle{
    public void colors(String color)
    {
        System.out.println("Color of Car is "+color);
    }
    int speed=20;
    public void ApplyBreak(int decrement)
    {
        speed=speed-decrement;
        System.out.println("Speed of Car After Applying breaks "+speed);

    }
    public void SpeedUp(int increment)
    {
        speed=speed+increment;
        System.out.println("Speed of Car After Speeding Up "+speed);
    }

}
class Bike implements Vehicle{
    public void colors(String color)
    {
        System.out.println("Color of Bike is "+color);
    }
    int speed=12;
    public void ApplyBreak(int decrement)
    {
        speed=speed-decrement;
        System.out.println("Speed of Bike After Applying breaks "+speed);

    }
    public void SpeedUp(int increment)
    {
        speed=speed+increment;
        System.out.println("Speed of Bike After Speeding Up "+speed);
    }

}

public class Interface {
    public static void main(String[] args) {
      Bicycle b=new Bicycle();
      b.colors("Green");
      b.ApplyBreak(3);
      b.SpeedUp(4);
      Car c=new Car();
      c.colors("Black");
      c.ApplyBreak(3);
      c.SpeedUp(4);
      Bike b1=new Bike();
      b1.colors("White");
      b1.ApplyBreak(3);
      b1.SpeedUp(4);

    }
}
