package com.company;

public class num_pat_2
{
    public static void main (String args[])
    {
        int p=1;
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }
    }
}