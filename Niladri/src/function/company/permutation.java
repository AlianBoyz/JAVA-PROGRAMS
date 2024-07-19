package function.company;
import javax.swing.plaf.synth.SynthStyleFactory;
import java.util.*;
public class permutation
{

    public static void main(String[] args)
    {
        String f,l;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.next();
        //int l=str.length();
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            f=str.substring(0,i);
            l=str.substring(i+1);
            System.out.println(f+l+ch);
        }
    }


    public static void per() {

    }
}
