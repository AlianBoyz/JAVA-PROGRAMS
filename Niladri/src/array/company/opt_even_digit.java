package array.company;

import java.util.*;

public class opt_even_digit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int []arr=new int[n];
        int c=0;
        System.out.println("Elements");
        for (int i = 0; i < n; i++)
        {
            arr[i]= sc.nextInt();
            if (even(arr[i]))
                c++;
        }
        System.out.println(c);
    }
    public static boolean even(int n)
    {
        int dig=(int) Math.log10(n)+1;
        if (dig%2==0)
            return true;
        else
            return false;
    }
}
//tc=O(n)+O(n)