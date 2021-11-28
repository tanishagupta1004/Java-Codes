class exception
{
    void arithmetic ()
    {
        try {
            int a = 30/0;
            System.out.println("Result = " + a);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException,can't divide a number by 0");
        }
    }
    void OutOfBounds()
    {
        try{
            int arr[] = new int[5];
            arr[6] = 9;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out Of Bounds");
        }
    }
    void StringOutOfBounds()
    {
        try{
            String  s= "Hello Thursday? ";
            char st = s.charAt(24);
            System.out.println(st);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
public class Lab {
    public static void main(String[] args) {
       exception e=new exception();
       e.arithmetic();
       e.OutOfBounds();
       e.StringOutOfBounds();

    }
}
