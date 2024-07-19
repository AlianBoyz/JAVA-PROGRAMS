package com.company;

import java.sql.SQLOutput;

public class rombus_pat
{
    public static void main (String args [])
    {
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j<5-i ; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 6 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
