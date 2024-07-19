package function.company;
import java.util.*;
public class mult_table
{
    public static void table(int n)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println(i+" * "+n+" = "+i*n);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        table(n);

    }
}
