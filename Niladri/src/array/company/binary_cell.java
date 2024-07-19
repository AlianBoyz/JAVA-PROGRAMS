package array.company;

import java.util.Scanner;

public class binary_cell
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int s=sc.nextInt();
        System.out.println("Enter the element");
        int arr[]=new int[s];
        for (int i = 0; i < s; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("target");
        int tgt= sc.nextInt();
        System.out.println(bin_cell(arr,tgt));
    }
    public static int bin_cell(int arr[],int t)
    {
        int l=0,h= arr.length,mid=0;
        while (l<=h)
        {
            mid=((l+h)/2);
            if (t==arr[mid])
                return arr[mid];
            else if (t<arr[mid])
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
        if (t>arr[mid])return arr[mid+1];
        else return arr[mid];
    }
}
