package function.company;

import java.util.Scanner;

public class sum_oddfunc
{
    public static void sum_odd(int n)
    {
        int sum =0;
        for (int i=0;i<n;i++)
        {
            if (i%2!=0)
            sum=sum+i;
        }
        System.out.println("The sum = "+sum);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        sum_odd(n);
    }
}
