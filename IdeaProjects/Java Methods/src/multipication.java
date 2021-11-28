public class multipication {
    int mul(int n)
    {
        int i;
        for(i=1;i<n;i++)
        {
            int ans=n*i;
            System.out.println((n+"*"+i)+"="+ans);
        }
        return n;

    }

    public static void main(String[] args) {
        multipication m=new multipication();
        m.mul(11);
    }

}
