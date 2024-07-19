package function.company;
import java.util.*;
public class avg_of_n_num
{
    public static int avg(int...a)
    {
        int l=a.length;
        int avg=0,res;
        for (int i=0;i<l;i++)
            avg+=a[i];
        res=avg/l;
        return res;
    }
    public static void main(String[] args)
    {
        System.out.println(avg(1,2,3,4,5,6,7,8,9,10));
    }
}
