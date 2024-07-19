package PLACEMENTS.company;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String or no");
        String s=sc.nextLine();
        Palindrome p=new Palindrome();
        System.out.println(p.chk_pal(s));
    }

    boolean chk_pal(String s)
    {
        StringBuilder sb=new StringBuilder(s);
        if (s.equals(sb.reverse().toString()))
            return true;
        return false;
    }
}
