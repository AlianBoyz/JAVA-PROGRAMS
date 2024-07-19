package array.company;
import java.util.*;
public class even_odd
{
    public static void main(String[] args)
    {
        int e=0,o=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        int[] odd=new int[num];
        int[] even=new int[num];
        System.out.println("Enter the element in the array");
        for (int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<num;i++)
        {
            if (arr[i]%2==0)
            {
                even[e++]=arr[i];
            }
            else
            {
                odd[o++]=arr[i];
            }
        }
        System.out.println("Even array = ");
        for (int i=0;i<e;i++)
        {
            System.out.println(even[i]);
        }
        System.out.println("Odd array = ");
        for (int i=0;i<o;i++)
        {
            System.out.println(odd[i]);
        }
    }
}
