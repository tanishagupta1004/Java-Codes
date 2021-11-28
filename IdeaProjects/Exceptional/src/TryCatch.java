class Arithmetic
{
    void Arm() {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Value of c is " + c);
        } catch (Exception e) {
            System.out.println("Error in the program");
            System.out.println(e);
        }
        System.out.println("End of the Program");
    }
    void array()
    {
        try{
            int arr[]={10,20,30,40};
            System.out.println(arr[10]);
        }
        catch (Exception e)
        {
            System.out.println("Error in the program");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
    void file()
    {

        try{
            String str ="Hello dear";
            System.out.println(str.charAt(24));
        }
        catch (Exception e)
        {
            System.out.println("Error in the program");
            System.out.println(e);
        }
        System.out.println("End of the program");

    }
}
public class TryCatch {
    public static void main(String[] args) {
        Arithmetic a=new Arithmetic();
        a.Arm();
        a.array();
        a.file();
    }
}
