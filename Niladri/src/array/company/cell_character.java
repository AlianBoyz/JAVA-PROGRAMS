package array.company;

import java.util.Scanner;

public class cell_character
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int s=sc.nextInt();
        System.out.println("Enter the element");
        char arr[]=new char[s];
        for (int i = 0; i < s; i++)
        {
            arr[i]=(sc.next()).charAt(0);
        }
        System.out.println("target");
        char tgt=(sc.next()).charAt(0);
        System.out.println(bin_cell(arr,tgt));
    }
    public static char bin_cell(char arr[],char t)
    {
        int l=0,h= arr.length-1,mid=0;
        while (l<=h)
        {
            mid=((l+h)/2);
            if (t<arr[mid])
            {
                h=mid-1;
                l=l;
            }
            else
            {
                l=mid+1;
                h=h;
            }
        }
//        if (t==arr[mid]&&t>arr[mid])return arr[mid+1];
        return arr[l % arr.length];
    }
}
