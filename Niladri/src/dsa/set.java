package dsa;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
public class set
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        if (!check(s))
            System.out.println("0");
        else
            System.out.println("1");
    }
    public static boolean check(String str)
    {
        Set<Character> hash=new HashSet<Character>();
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (Character.isLetter(ch))
                hash.add(ch);
        }
        System.out.println(hash);
        System.out.println(hash.size());
        if (hash.size()==26)
            return true;
        else
            return false;
    }
}
