package com.company;

public class pat4_prac
{
    public static void main(String ags[])
    {
        for (int i=1;i<5;i++)
        {
            for(int j=5-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=5-2;i>=1;i--)
        {
            for (int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=2*i-1;k>=1;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}