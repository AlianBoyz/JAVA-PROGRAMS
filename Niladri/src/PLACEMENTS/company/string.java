package PLACEMENTS.company;
import java.util.*;
public class string
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("Loop "+str_rev_loop(str));
        System.out.println("finction "+str_rev_func(str));
    }

    private static String str_rev_loop(String str)
    {
        String s="";
        StringBuffer st=new StringBuffer(s);
        for (int i=str.length()-1;i>=0;i--)
        {
            st.append(str.charAt(i));
        }
        return st.toString();
    }

    private static String str_rev_func(String str)
    {
        String s =str;
        StringBuilder st=new StringBuilder(s);
        st.reverse();
        return st.toString();
    }


}
