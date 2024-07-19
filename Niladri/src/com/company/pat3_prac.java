package com.company;

public class pat3_prac
{
    public static void main(String ags[])
    {
        for (int i=5;i>=1;i--)
        {
            for(int j=5-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int k=i*2-1;k>=1;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        long l=0;
        l++;
        l++;
        System.out.println(l);
    }
}
