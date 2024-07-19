package PLACEMENTS.company;

import java.util.Scanner;

public class identify_number
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        System.out.println(isPrime(num));
        System.out.println(isArm(num));
        System.out.println(isPal(num));
        System.out.println(isMagic(num));
        mag2(num);
    }

    public static void mag2(int num)
    {
        if (num%9==1)
            System.out.println("Magic");
        else
            System.out.println("Not magic");
    }
    private static boolean isMagic(int num)
    {
        int dig=0;
        int l=(int)Math.log10(num)+1;
        int sum=0;
        while (num>0||sum>9)
        {
            if (num!=0) {
                dig = num % 10;
                sum += dig;
                num /= 10;
            }
            else {
                num = sum;
                sum=0;// resetting sum value
            }
        }
       if (sum==1)
           return true;
       return false;
    }

    private static boolean isPal(int num)
    {
        String n=Integer.toString(num);
        Palindrome p=new Palindrome();
        return p.chk_pal(n);
    }

    private static boolean isArm(int num)
    {
        int n=num,arm=0,dig=0;
        int l= (int) (Math.log10(n)+1);
        while (n!=0)
        {
            dig=n%10;
            arm+=Math.pow(dig,l);
            n/=10;
        }
        if (num==arm)
            return true;
        return false;
    }

    private static boolean isPrime(int num)
    {
        int c=0;
        for (int i = 1; i <=num; i++)
        {
            if (num%i==0)
                c++;
        }
        if (c>=3)
            return false;
        return true;
    }
}
