package function.company;
import java.util.*;
public class avg_func
{
    public static void avg(int a,int b,int c)
    {
        int avg=0;
        avg=a+b+c;
        avg=avg/3;
        System.out.println("The average is "+avg);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        avg(a,b,c);
        int f=5;
        int g=++f+f+++--f;
        System.out.println(g);
    }
}
