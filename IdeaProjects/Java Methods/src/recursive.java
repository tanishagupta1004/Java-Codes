public class recursive {
    int sum(int n)
    {
        int sum=0;
        if(n==1)
        {
            return 1;
        }
        else
        {
            return sum+n;

        }

    }

    public static void main(String[] args) {
       recursive r=new recursive();
       r.sum(10);
    }
}
