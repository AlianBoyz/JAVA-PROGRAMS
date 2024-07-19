package com.company;

public class butterfly_pattern
{
    public static void main(String args[])
    {
        int i,j=0;
        //outer loop
        int space=0;
        for (i=0;i<5;i++)
        {
            for (j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            space = 2 * (4 - i);
            for (j = 0; j < space; j++)
            {
                System.out.print(" ");
            }
            for (j = 0; j <i; j++)
            {
                    System.out.print("*");
            }
            System.out.println(" ");
        }
        for (i=4;i>0;i--)
        {
            for (j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            space = 2 * (4 - i);
            for (j = 0; j < space; j++)
            {
                System.out.print(" ");
            }
            for (j = 0; j <i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
