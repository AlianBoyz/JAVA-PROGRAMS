package array.company;
import java.util.*;
public class Binary_search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int s= sc.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Element to search");
        int ele=sc.nextInt();
        //sorting the array
        Arrays.sort(arr);
        Binary_search obj=new Binary_search();
        int res=obj.binary(ele,arr);
        if (res>=0)
            System.out.println("Element is found "+res);
        else
            System.out.println("Element not found");
    }
    public int binary(int e,int arr[])
    {
        int l=0,h=arr.length-1,mid=0;
        while (l<=h)
        {
            mid=(l+h)/2;
            if(e==arr[mid])
                return mid;
            else if(e<arr[mid])
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
        return -1;
    }
}
