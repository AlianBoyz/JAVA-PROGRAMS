package PLACEMENTS.company;

import java.util.Scanner;

public class duplicate_character
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str= sc.nextLine();
        find_dup(str);
    }

    private static void find_dup(String str)
    {
        int let[]=new int[26];
        char cha[]=str.toCharArray();
        int cnt=0;
        for (int i = 0; i < str.length()-1; i++)
        {
            cnt=1;
            for (int j = i+1; j <str.length()-1; j++)
            {
                if (str.charAt(i)==str.charAt(j)&&str.charAt(i)!=' ') {
                    cnt++;
                    cha[j]='0';//mark visited word 0 to avoid counting again
                }
            }
            if (cnt>1&&cha[i]!='0')
                System.out.println(str.charAt(i)+" "+cnt);
        }
    }
}
