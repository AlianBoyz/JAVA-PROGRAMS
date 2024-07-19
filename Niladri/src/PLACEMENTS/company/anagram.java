package PLACEMENTS.company;

import java.util.Arrays;
import java.util.Scanner;

public class anagram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers");
        String n1= sc.next();
        String n2= sc.next();
        System.out.println(anagram(n1,n2));
        //anagram_per(n1,n2);
    }

    private static void anagram_per(int n1, int n2) {
    }

    private static boolean anagram(String  n1, String n2)
    {
        char c1[]=n1.toCharArray();
        char c2[]=n2.toCharArray();
        int flag=0;
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i]==c2[i])
                flag+=1;
        }
        if (c1.length==c2.length&&flag==c1.length)
            return true;
        return false;
    }
}
