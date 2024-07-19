package array.company;
import java.util.*;
public class selection_sort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array ");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        selection(arr,n);
        System.out.println("Elements after sorting");
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    static int []selection(int arr[],int n)
    {
        int small=0,temp=0,ind=0;
        for (int i=0;i<n-1;i++)
        {
            small = i;
            for (int j=i+1;j<n;j++)
            {
                if (arr[small] > arr[j])
                {
                    small=j;
                    //7 8 3 1 2
                }
            }
            temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
