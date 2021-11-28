public class Addition {
    public static void main(String[] args) {
        int x=Integer.parseInt(args[0]);
        int reverse=0;

        while(x!=0)
        {

          int remainder=x%10;
            reverse=reverse+remainder;
            x=x/10;
        }
        System.out.println("Reverse of a no is "+reverse);
    }

}
