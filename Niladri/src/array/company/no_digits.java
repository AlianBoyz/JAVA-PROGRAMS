package array.company;

import java.util.*;
public class no_digits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++)
        {
            int len=(int)Math.log10(arr[i])+1;
            System.out.println(arr[i]+" => "+len);
        }
    }
}


/*arr = [12,244,534,234234,234,2]
    12 => 2
    244 => 3
    534 => 3
    etc...
*/