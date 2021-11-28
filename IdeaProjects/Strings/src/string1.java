public class string1 {
    public static void main(String[] args) {
        String s="The quick brown fox jumps over the lazy dog";

        int len,i,j;
        len = s.length();
        for (i=97;i<=122;i++)
        {
            for(j=0;j<len;j++)
            {
                char a = s.charAt(j);
                char c=(char)i;
                if(a==c)
                {
                    System.out.println("The index of "+c+" is "+j);
                }
            }
        }



    }
}
