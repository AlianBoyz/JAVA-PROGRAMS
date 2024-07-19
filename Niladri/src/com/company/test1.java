package com.company;
import java.util.*;
import java.lang.Math;

class test1
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to convert it in number");
        String str=sc.nextLine();
        if(chk (str)==-1)
            System.out.println("Not Possible");
        else
            System.out.println(chk(str));
    }
    public static int chk(String s)
    {
        int ret=0;int l=0;boolean neg=false;
        for (int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            int I=ch-'0';
            if (I>=0&&I<=9)
            {
                ret+=(I*Math.pow(10,l));
                l++;
            }
            else if (ch=='-')
            {
                if (i!=0)
                    return -1;
                else
                    neg=true;
            }
            else
            {
                return -1;
            }
        }
        if (neg)
            return ret*-1;
        else
            return ret;
    }
}
// - 1 2 3 a
// 0 1 2 3 4  index