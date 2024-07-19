package com.company;

public class pat7_parc
{
    public static void main(String args[])
    {
        //int n=1;
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (i%2==0)
                {
                    if (j%2==0)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                else
                if (j%2==0)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            for (int j = 2*4-i; j >= i+1; j--)
            {
                    System.out.print("  ");
            }
            for (int j = i; j >= 1; j--)
            {
                if (i%2==0)
                {
                    if (j%2==0)
                        System.out.print(" *");
                    else
                        System.out.print("  ");
                }
                else
                if (j%2==0)
                    System.out.print("  ");
                else
                    System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 4-1; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                if (i%2==0)
                {
                    if (j%2==0)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                else
                if (j%2==0)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            for (int j = 2*4-i; j >= i+1; j--)
            {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--)
            {
                if (i%2==0)
                {
                    if (j%2==0)
                        System.out.print(" *");
                    else
                        System.out.print("  ");
                }
                else
                if (j%2==0)
                    System.out.print("  ");
                else
                    System.out.print(" *");
            }
            System.out.println();
        }
    }
}
/*
    1 2 3 4 5 6 7
1   6 - - - - - 6
2   - 6 - - - 6 -
3   6 - 6 - 6 - 6
4   - 6 - 6 - 6 -
5   6 - 6 - 6 - 6
6   - 6 - - - 6 -
7   6 - - - - - 6
*/
