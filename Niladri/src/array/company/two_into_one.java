package array.company;
import java.util.*;
public class two_into_one
{
    public static void main(String[] args)
    {
        int oo=0,t=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of 1st array");
        int m=sc.nextInt();
        int[] arr1=new int[m];
        System.out.println("Enter the element");
        for (int i=0;i<m;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of 2st array");
        int n=sc.nextInt();
        int[] arr2=new int[n];
        System.out.println("Enter the element");
        for (int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int o=m+n;
        int[] arr=new int[o];
        for (int i=0;i<m;i++)
        {
            arr[i]=arr1[i];
        }
        for (int i=0;i<n;i++)
        {
            arr[m+i]=arr2[i];
        }
        System.out.println("The merged array");
        for (int i=0;i<o;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
