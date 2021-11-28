class Cellphone1{
    public void Ringing()
    {
        System.out.println("Phone is Ringing");
    }
    public void vibrate()
    {
        System.out.println("Phone is Vibrating");
    }
}
public class cellphone {
    public static void main(String[] args) {
        Cellphone1 c=new Cellphone1();
        c.Ringing();
        c.vibrate();

    }
}
