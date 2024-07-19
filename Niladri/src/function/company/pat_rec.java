package function.company;

public class pat_rec
{
    public static void patt(int n)
    {
        if (n>0)
        {
            patt(n-1);
            for (int i=n;i>0;i--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        patt(5);
    }
}
