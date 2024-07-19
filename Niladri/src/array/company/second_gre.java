package array.company;
import java.lang.reflect.Array;
import java.util.*;
public class second_gre
{
    public static void main(String[] args)
    {
        int g,s;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the element");
        for (int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        g=arr[0];
        for (int i=0;i<n;i++)
        {
            if (g<arr[i])
                g=arr[i];
        }
        int temp=0;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        s=arr[arr.length-2];
        System.out.println("Second largest element in the array "+s);
    }
}
