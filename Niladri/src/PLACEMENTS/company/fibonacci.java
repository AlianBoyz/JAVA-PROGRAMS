package PLACEMENTS.company;

import java.util.Scanner;

public class fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int n= sc.nextInt();
        int f=0,s=1,fib=0;
        System.out.print(f+" "+s+" ");
        while(n!=0)
        {
            fib=f+s;
            System.out.print(fib+" ");
            f=s;s=fib;
            n--;
        }
    }
}
