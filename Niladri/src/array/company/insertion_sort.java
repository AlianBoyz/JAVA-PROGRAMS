package array.company;
import java.util.*;
public class insertion_sort
{
    public static void main(String[] args)
    {
        //int small=0,temp=0,ind=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array ");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Sorted array");
        insertion(arr,n);
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void insertion(int arr[],int s)
    {
        int temp=0,j = 0;
        for (int i=1;i<s;i++)
        {
            temp=arr[i];   //-->
            j=i-1;
            for (;j>=0;j--)   //<--
            {
                if (arr[j]>temp)
                    arr[j+1]=arr[j];  //shift the ele and store 2 _ 4 (3)
                else
                    break;   //Exit no remain there
            }
            arr[j+1]=temp; // inserting the 29th ele here
        }
    }
}