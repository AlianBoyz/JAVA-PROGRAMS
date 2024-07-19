package PLACEMENTS.company;

import java.util.Scanner;

public class no_words
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String str= sc.nextLine();
        int cnt=0,nw=0;
        while (cnt!=str.length())
        {
            if((Character.isLetter(str.charAt(cnt)))==true)
                nw++;
            cnt++;
        }
        System.out.println(nw);
    }
}
