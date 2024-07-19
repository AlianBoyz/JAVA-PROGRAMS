package array.company;
import java.util.*;
public class bubble_sort
{
    public static void main(String[] args)
    {
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array ");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if (arr[i]>arr[j])
                {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        System.out.println("Elements after sorting");
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
