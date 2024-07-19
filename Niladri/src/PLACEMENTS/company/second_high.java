package PLACEMENTS.company;

import java.util.Scanner;

public class second_high
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=0,max2=0;
        for (int i = 0; i < arr.length; i++)
        {
            if (max<arr[i])
            {
                max2=max;
                max=arr[i];
            }
        }
        System.out.println(max2);
    }
}
