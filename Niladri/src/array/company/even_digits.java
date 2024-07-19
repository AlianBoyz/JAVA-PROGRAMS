package array.company;

import java.util.*;

public class even_digits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Elements");
        for (int i = 0; i < n; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println(even_d(arr));
    }
    public static int even_d(int arr[])
    {
        int cnt=0,len=0;
        for (int i = 0; i < arr.length; i++)
        {
            len=(int) Math.log10(arr[i])+1;
            if (len%2==0)
                cnt++;
        }
        return cnt;
    }
}

//tc=O(n)+O(n)
